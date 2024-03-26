package ru.ogai.java.basic.homeworks.hw13_2;

import javax.lang.model.element.TypeElement;

public class CrossCountry implements Transport {
    private int fuel;
    private Person driver;

    public CrossCountry(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "CrossCountry{" +
                "fuel=" + fuel ;
    }

    @Override
    public boolean move(int distance, TypeOfArea area) {
        if (driver == null) {
            System.out.println("водителя нет");
            return false;
        }
        int costEnergy = getCostEnergy(distance);
        if (fuel < costEnergy) {
            System.out.println("не хватает топлива");
            return false;
        }
        decreaseEnergy(costEnergy);
        System.out.println("вездеход проехал " + distance + " км, по " + area);
        return true;
    }
    private int getCostEnergy(int distance) {
        return 2*distance;
    }
    public void decreaseEnergy(int costEnergy) {
        fuel -= costEnergy;
    }
    @Override
    public void setDriver(Person driver) {
        this.driver = driver;
    }
}
