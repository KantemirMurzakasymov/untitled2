package condition;

import com.company.Car;
import driveerPerson.Person;
import java.util.Scanner;

public class MainClassStartAll {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int breaakk = 0;
        while (true) {
            try{
                System.out.println("Enter an ID Between ( 1-3 ) AND For Exit ( 0 ) ");
                num = scanner.nextInt();
                if (num == 1) {
                    System.out.println(Car.readCarsInformation(1, "Renault Megan", "0", "ON BASE ")
                            + "-> " + Person.readPersonInformation(1, "Mike"));
                } else if (num == 2) {
                    System.out.println(Car.readCarsInformation(2, "Volvo FH12", "0", "ON BASE ")
                            + "-> " + Person.readPersonInformation(2, "Jeck"));
                } else if(num==3){
                    System.out.println(Car.readCarsInformation(3, "Daf XF", "0", "ON BASE ")
                            + "-> " + Person.readPersonInformation(3, "Tony"));
                }else{
                    System.out.println("Enter an ID in Number Format Please !!! ");
                    System.out.println("Out From System !!! ");
                    //System.exit(0);

                    if(num == breaakk){
                        break;
                    }

                }

            }catch(Exception e){
                System.out.println(e.getMessage());

                 }
        }
    }
}


