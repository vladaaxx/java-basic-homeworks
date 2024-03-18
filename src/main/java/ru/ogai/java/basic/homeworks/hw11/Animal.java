package ru.ogai.java.basic.homeworks.hw11;

public abstract class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public double run(int distance) {
        if (distance > 0) {
            double time = (double) distance / runSpeed;
            stamina -= distance;
            if (stamina < 0) {
                System.out.println(name + " устал(а) и не может продолжать бег");
                stamina = 0;
                return -1;
            }
            System.out.printf("%s пробежал(а) %d метров за %f секунд", name, distance, time);
            System.out.println();
            return time;
        }
        System.out.println("Расстояние отрицательно");
        return 0;
    }

    public abstract double swim(int distance);

    public void info() {
        System.out.printf("Имя: %s\nCкорость бега: %d\nСкорость плавания: %d\nВыносливость: %d\n", name, runSpeed, swimSpeed, stamina);
        System.out.println();
    }
}

