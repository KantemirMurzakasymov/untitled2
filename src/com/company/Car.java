package com.company;

public class Car {
    private int id;
    private String name;
    private String draver;
    private String state;

    public static Car readCarsInformation(int id, String name, String draver, String state){
        Car cars = new Car();
        cars.id = id;
        cars.name= name;
        cars.draver= draver;
        cars.state=state;

        return cars;
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

    public String getDraver() {
        return draver;
    }

    public void setDraver(String draver) {
        this.draver = draver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", draver='" + draver + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
