package ru.ogai.java.basic.homeworks.homework12;

public class MainApp {
    public static void main(String[] args) {
        Plate plate1 = new Plate(10);
        Cat[] cats = {new Cat("Kisa", 3),
                new Cat("Kitty", 5),
                new Cat("Barsik", 7),
                new Cat("Meow", 6)};

        // plate1.addFood(2);
        // plate1.decreaseFood(6);
        // plate1.addFood(1);
        for (Cat cat : cats){
            cat.eat(plate1);
        }

        for (Cat cat : cats){
            cat.info();
        }
    }

}
