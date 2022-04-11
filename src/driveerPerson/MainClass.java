package driveerPerson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MainClass {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson gson = BUILDER.setPrettyPrinting().create();
    public static final Path sakta = Paths.get("./Person.json");

    public static void main(String[] arg) {
        Person[] persons = {
                Person.readPersonInformation(1, "Mike"),
                Person.readPersonInformation(2, "Jeck"),
                Person.readPersonInformation(3, "Tony")
        };
        String jsonFile = gson.toJson(persons);
        write(jsonFile);
        System.out.println( readF());
        System.out.println("    # | Driver        | Bus     ");
        System.out.println("  -----+---------------+---------");
        System.out.println("   1  | Mike          |         ");
        System.out.println("   2  | Jeck          |          ");
        System.out.println("   3  | Tony          |          ");

    }
    private static String write(String obje) {
        Path write = Paths.get(String.valueOf(sakta));
        try {
            Files.writeString(write, obje, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

        } catch (IOException e) {
            e.getMessage();
        }
        return obje;
    }

    private  static String readF(){
        String json="";
        try {
            FileReader fr = new FileReader(String.valueOf(sakta));
            int a=0;
            while ((a= fr.read())!=-1){
                json+= (char) a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}