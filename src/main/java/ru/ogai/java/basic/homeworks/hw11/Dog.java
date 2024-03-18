package ru.ogai.java.basic.homeworks.hw11;

public class Dog extends Animal{
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double swim(int distance) {
        if (distance > 0) {
            double time = (double) distance / runSpeed;
            stamina -= (distance * 2);
            if (stamina < 0) {
                System.out.println(name + " устал(а) и не может продолжать плыть");
                stamina = 0;
                return -1;
            }
            System.out.printf("%s проплыла(а) %d метров за %f секунд ", name, distance, time);
            System.out.println();
            return time;
        }
        System.out.println("Расстояние отрицательное");
        return -1;


    }
}
