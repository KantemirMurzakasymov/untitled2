package driveerPerson;

import com.company.Car;

public class Person {
    private int id;
    private String name;

    public static Person readPersonInformation(int id, String name){
        Person person = new Person();
        person.id = id;
        person.name= name;
        return person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
