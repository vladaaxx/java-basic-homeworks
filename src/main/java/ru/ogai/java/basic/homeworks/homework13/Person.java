package ru.ogai.java.basic.homeworks.homework13;

public class Person {
    private String name;
    private Transport currentTransport;
    private int energy;

    public Person(String name, int energy) {
        this.name = name;
        this.energy = energy;
        this.currentTransport = null;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean goOn(Transport transport) {
        if (currentTransport == null) {
            this.currentTransport = transport;
            System.out.println("человек сел в/на " + transport.getTransport());
            return true;
        }
        System.out.println("человек уже в/на транспорте");
        return false;
    }

    public boolean goOff(Transport transport) {
        if (currentTransport != null) {
            this.currentTransport = null;
            System.out.println("человек теперь на ногах");
            return true;
        }
        System.out.println("человек уже не на транспорте");
        return false;
    }

    public boolean move(int distanse, TypeOfArea area) {
        if (currentTransport != null) {
            if (currentTransport.move(distanse, area) == true) {
                if (currentTransport.getTransport() == "велосипед") {
                    energy -= 2 * distanse;
                }
                System.out.println("человек едет на " + currentTransport.getTransport() + " " + distanse + " км");
                return true;
            }
            return false;
        }
        System.out.println("человек идет пешком " + distanse + " км");
        return false;
    }

}
