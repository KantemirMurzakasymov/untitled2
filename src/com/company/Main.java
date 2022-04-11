package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson oku = BUILDER.setPrettyPrinting().create();
    public static final java.nio.file.Path yaz = Paths.get("./Car.json");

    public static void main(String[] arg) {

        Car[] cars = {
                Car.readCarsInformation(1, "Renault Megan", "0", "ON BASE "),
                Car.readCarsInformation(2, "Volvo FH12", "0", "ON BASE "),
                Car.readCarsInformation(3, "Daf XF", "0", "ON BASE "),
        };

        String js = oku.toJson(cars);
        write(js);
        System.out.println(readF());
        System.out.println("    # | Bus           | Driver      | State     ");
        System.out.println("------+---------------+-------------+-----------     ");
        System.out.println("   1  | Renault Megan |             | On base   ");
        System.out.println("   2  | Volvo FH12    |             | On base    ");
        System.out.println("   3  | DAF FX        |             | On base   ");

    }
    private static String write(String obje) {
        Path write = Paths.get(String.valueOf(yaz));
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
            FileReader fr = new FileReader(String.valueOf(yaz));
            int a = 0;
            while ((a = fr.read())!= -1){
                json+= (char) a;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}
