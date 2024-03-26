package ru.ogai.java.basic.homeworks.hw13_2;

public class MainApp {
    public static void main(String[] args) {

        Person person = new Person("Sam", 10);

        CrossCountry crossCountry = new CrossCountry(10);
        person.goOn(crossCountry);
        person.move(2, TypeOfArea.FLATLAND);
        System.out.println(crossCountry);
        person.move(5, TypeOfArea.FLATLAND);
        System.out.println(crossCountry);
        person.goOff();
        Horse horse = new Horse(10);
        person.goOn(horse);
        person.move(2, TypeOfArea.FLATLAND);
        System.out.println(horse);

    }
}
