package ru.ogai.java.basic.homeworks.homework13;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distanse, TypeOfArea area) {
        if (area == TypeOfArea.FLATLAND){
            if (fuel >= distanse){
                fuel -= distanse;
                System.out.println("машина проехала " + distanse + " км");
                return true;
            }
            System.out.println("машине не хватает бензина");
            return false;
        }
        System.out.println("машина не ездит тут");
        return false;
    }

}

