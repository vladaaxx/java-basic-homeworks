package ru.ogai.java.basic.homeworks.hw13_2;

public class Person {
    private String name;
    private Transport currentTransport;
    private int energy;

    public Person(String name, int energy) {
        this.name = name;
        this.currentTransport = currentTransport;
        this.energy = energy;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", currentTransport=" + currentTransport +
                ", energy=" + energy +
                '}';
    }

    public void decreaseEnergy(int costEnergy) {
        energy -= costEnergy;
    }

    private int getCostEnergy(int distance) {
        return 2 * distance;
    }

    public void goOn(Transport transport) {
        if (currentTransport != null) {
            System.out.println("сначала слезте с текущего транспорта");
            return;
        }
        currentTransport = transport;
        currentTransport.setDriver(this);
        System.out.println("теперь человек на " + currentTransport);
    }

    public void goOff() {
        if (currentTransport == null) {
            System.out.println("вы не на транспорте");
            return;
        }
        currentTransport.setDriver(null);
        System.out.println("человек слез с " + currentTransport);
        currentTransport = null;
    }

    public boolean move(int distance, TypeOfArea area) {
        if (currentTransport != null) {
            return currentTransport.move(distance, area);
        }
        int costEnergy = getCostEnergy(distance);
        if (costEnergy > energy) {
            System.out.println("энергии не хватает!!");
            return false;
        }
        decreaseEnergy(costEnergy);
        System.out.println("человек прошел пешком " + distance);
        return true;
    }

}
