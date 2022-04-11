package condition;

import com.company.Car;
import driveerPerson.Person;

import java.util.Scanner;

public class Durum implements personMethods{
    private String base;
    private String road;
    private String repair;

//    @Override
//    public void chande(Car id, Person idd) {
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            int salistir = sc.nextInt();
//            if(salistir == 1 ){
//                System.out.println(id.getName()+ "->"+ idd.getName());
//            }else if(salistir==2){
//                System.out.println(id.getName()+"->"+ idd.getName());
//            }else if(salistir==3){
//                System.out.println(id.getName()+"->"+ idd.getName());
//            }
//            System.exit(0);
//        }
//
//    }
//    @Override
//    public void start(Car id, Person idd) {
//        if(id.getName().equals(idd.getName())){
//            System.out.println("Full ");
//        }else{
//            System.out.println("Repeair ");
//        }
//
//    }
//
//    @Override
//    public void repair(Car id, Person idd) {
//        if(id.getName().equals(idd.getId())){
//            System.out.println("It is OK ");
//        }else{
//            System.out.println("It is not OK ");
//        }
//
//    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }

    @Override
    public String toString() {
        return "Durum{" +
                "base='" + base + '\'' +
                ", road='" + road + '\'' +
                ", repair='" + repair + '\'' +
                '}';
    }


}
