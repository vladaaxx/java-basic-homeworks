package ru.ogai.java.basic.homeworks.homework13;

public class Horse implements Transport {
    private int force;
    public Horse(int force) {
        this.force = force;
    }

    @Override
    public boolean move(int distanse, TypeOfArea area) {
        if (area != TypeOfArea.SWAMP){
            if (force >= distanse){
                force -= distanse;
                System.out.println("Лошадь проскакала " + distanse + " км");
                return true;
            }
            System.out.println("лошади не хватает сил");
            return false;
        }
        System.out.println("лошадь не ходит тут");
        return false;
    }
}
