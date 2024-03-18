package ru.ogai.java.basic.homeworks.hw11;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }

    @Override
    public double swim(int distance) {
        System.out.println(name + " плавать не умеет");
        return 0.0;
    }
}
