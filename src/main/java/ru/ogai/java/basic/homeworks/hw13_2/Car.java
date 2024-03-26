package ru.ogai.java.basic.homeworks.hw13_2;

import java.util.Arrays;

public class Car implements Transport {
    private int fuel;
    private Person driver;
    private TypeOfArea[] areaAccess;

    public Car(int fuel) {
        this.fuel = fuel;
        this.areaAccess = new TypeOfArea[]{TypeOfArea.FLATLAND};
    }

    private boolean isAreaAccessed(TypeOfArea area) {
        for (TypeOfArea a : areaAccess) {
            if (a.equals(area)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean move(int distance, TypeOfArea area) {
        if (driver == null) {
            System.out.println("водителя нет");
            return false;
        }
        if (!isAreaAccessed(area)) {
            System.out.println("по " + area + " нельзя проехать на машине");
            return false;
        }
        int costEnergy = getCostEnergy(distance);
        if (fuel < costEnergy) {
            System.out.println("не хватает топлива");
            return false;
        }
        decreaseEnergy(costEnergy);
        System.out.println("машина проехала " + distance + " км");
        return true;
    }

    @Override
    public void setDriver(Person driver) {
        this.driver = driver;
    }

    private int getCostEnergy(int distance) {
        return distance;
    }
    public void decreaseEnergy(int costEnergy) {
        fuel -= costEnergy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", areaAccess=" + Arrays.toString(areaAccess) +
                '}';
    }
}
