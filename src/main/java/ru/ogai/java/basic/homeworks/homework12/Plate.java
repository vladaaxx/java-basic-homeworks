package ru.ogai.java.basic.homeworks.homework12;

public class Plate {
    protected int foodMax;
    protected int foodNow;

    public Plate(int foodMax) {
        this.foodMax = foodMax;
        foodNow = foodMax;
    }

    public int addFood(int food){
        if (foodNow + food < foodMax){
            foodNow += food;
            System.out.println("теперь в тарелке " + foodNow + " еды");
            return foodNow;
        }
        if (foodNow + food > foodMax){
            System.out.println("в тарелку больше не поместится");
            return foodMax;
        }
        System.out.println("в тарелке уже есть еда");
        return 0;
    }

    public boolean decreaseFood(int food){
        if (foodNow > 0 && foodNow >= food){
            foodNow -= food;
            System.out.println("теперь в тарелке " + foodNow + " еды");
            return true;
        }
        System.out.println("в тарелке не хватает еды");
        return false;
    }
}

