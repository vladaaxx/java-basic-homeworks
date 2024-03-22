package ru.ogai.java.basic.homeworks.homework13;

public class CrossCountry implements Transport {
    private int fuel;

    public CrossCountry(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distanse, TypeOfArea area) {

        if (fuel >= 2 * distanse) {
            fuel -= 2 * distanse;
            return true;
        }
        System.out.println("вездеходу не хватает бензина");
        return false;
    }
    @Override
    public String getTransport() {
        return "вездеход";
    }
}
