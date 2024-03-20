package ru.ogai.java.basic.homeworks.homework13;

public class Bicycle implements Transport {
   private int energy;
    public Bicycle(Person person) {
        this.energy = person.getEnergy();
    }

    @Override
    public boolean move(int distanse, TypeOfArea area) {
        if (area != TypeOfArea.SWAMP){
            if (energy >= 2*distanse){
                energy -= 2*distanse;
                System.out.println("Велосипед проехал " + distanse + " км");
                return true;
            }
            System.out.println("у человека не хватает сил");
            return false;
        }
        System.out.println("велосипед не ездит тут");
        return false;
    }
}
