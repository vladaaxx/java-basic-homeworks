package ru.ogai.java.basic.homeworks.hw13_2;

import java.util.Arrays;

public class Horse implements Transport {
    private int force;
    private Person rider;
    private TypeOfArea[] areaAccess;

    public Horse(int force) {
        this.force = force;
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
    public String toString() {
        return "Horse{" +
                "force=" + force +
                ", areaAccess=" + Arrays.toString(areaAccess) +
                '}';
    }


    @Override
    public boolean move(int distance, TypeOfArea area) {
        if (rider == null) {
            System.out.println("наездника нет");
            return false;
        }
        if (!isAreaAccessed(area)) {
            System.out.println("по " + area + " лошадь не ходит");
            return false;
        }
        int costEnergy = getCostEnergy(distance);
        if (force < costEnergy) {
            System.out.println("у лошади не хватает сил");
            return false;
        }
        decreaseEnergy(costEnergy);
        System.out.println(" проскакала " + distance + " км");
        return true;
    }

    @Override
    public void setDriver(Person rider) {
        this.rider = rider;
    }

    private int getCostEnergy(int distance) {
        return distance;
    }

    public void decreaseEnergy(int costEnergy) {
        force -= costEnergy;
    }
}
