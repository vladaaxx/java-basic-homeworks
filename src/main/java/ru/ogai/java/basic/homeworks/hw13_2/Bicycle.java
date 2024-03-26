package ru.ogai.java.basic.homeworks.hw13_2;

import java.util.Arrays;

public class Bicycle implements Transport {
    private Person driver;
    private TypeOfArea[] areaAccess;

    public Bicycle() {
        this.areaAccess = new TypeOfArea[]{TypeOfArea.FOREST, TypeOfArea.FLATLAND};
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
            System.out.println("тут нельзя проехать на велосипеде");
            return false;
        }
        int costEnergy = getCostEnergy(distance);
        if (driver.getEnergy() < costEnergy) {
            System.out.println("у водителя не хватает энергии");
            return false;
        }
        driver.decreaseEnergy(costEnergy);
        System.out.println("велосипед проехал " + distance + " км");
        return true;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "areaAccess=" + Arrays.toString(areaAccess) +
                '}';
    }

    @Override
    public void setDriver(Person driver) {
        this.driver = driver;
    }

    private int getCostEnergy(int distance) {
        return distance;
    }
}
