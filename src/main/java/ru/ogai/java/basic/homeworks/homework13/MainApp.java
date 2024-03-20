package ru.ogai.java.basic.homeworks.homework13;

public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person("Sam", 1);
        Bicycle bicycle1 = new Bicycle(person1);
        Car car1 = new Car(5);
        person1.goOn(car1);
        person1.move(2, TypeOfArea.FLATLAND);

//        person1.goOn(car1);
//        person1.move(2, TypeOfArea.FLATLAND );
//        person1.move(2, TypeOfArea.FOREST );
//        person1.goOff(car1);
//        person1.move(2, TypeOfArea.FOREST);
    }
}
