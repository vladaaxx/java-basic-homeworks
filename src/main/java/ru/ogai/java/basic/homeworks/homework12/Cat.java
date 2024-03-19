package ru.ogai.java.basic.homeworks.homework12;

public class Cat {
    protected String name;
    protected int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Plate plate) {
        if (satiety == false) {
            if (appetite <= plate.foodNow) {
                System.out.println(name + " покушал");
                plate.decreaseFood(appetite);
                return satiety = true;
            } else {
                System.out.println("для " + name + " еды в тарелке не хватает");
                return false;
            }
        }
        System.out.println("котик не голоден");
        return false;
    }

    public void info() {
        if (satiety == true) {
            System.out.println("Котик " + name + " сыт");
        } else {
            System.out.println("Котик " + name + " голоден");
        }

    }
}
