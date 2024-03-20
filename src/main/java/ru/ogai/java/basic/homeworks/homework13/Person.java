package ru.ogai.java.basic.homeworks.homework13;

public class Person {
    private String name;
    private Transport currentTransport;
    private int energy;

    public Person(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

   /* public void setCurrentTransport(TypeOfTransport currentTransport) {

        this.currentTransport = currentTransport;
    }

    public String getCurrentTransport() {
        System.out.println(currentTransport);
        return currentTransport;
    }

    @Override
    public boolean move(int distanse, TypeOfArea area) {
        return false;
    }*/
}
