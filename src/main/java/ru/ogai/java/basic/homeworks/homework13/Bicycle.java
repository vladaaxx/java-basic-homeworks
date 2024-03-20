package ru.ogai.java.basic.homeworks.homework13;

public class Bicycle implements Transport {
   private int energy;
    public Bicycle(Person person) {
        this.energy = person.getEnergy();
    }

    public int getBEnergy() {
        return energy;
    }

    @Override
    public boolean move(int distanse, TypeOfArea area)  {
        if (area != TypeOfArea.SWAMP){
            if (energy >= 2*distanse){
                return true;
            }
            System.out.println("у человека не хватает сил");
            return false;
        }
        System.out.println("велосипед не ездит тут");
        return false;
    }
    @Override
    public String getTransport() {
        return "велосипед";
    }
}
