package ru.ogai.java.basic.homeworks.hw11;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kotya", 1, 0, 5);
        Dog dog1 = new Dog("Sharik", 2, 15, 10);
        Horse horse1 = new Horse("Skakun", 3, 4, 10);

        cat1.run(5);
        cat1.swim(3);
        cat1.info();
        dog1.swim(-3);
        horse1.swim(1);
        horse1.run(4);
        dog1.info();
    }
}