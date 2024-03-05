package ru.ogai.java.basic.homeworks.homework4;

public class Box {
    private int width;
    private int height;
    private int depth;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Коробка сейчас закрыта");
        } else {
            System.out.println("Коробка уже закрыта");
        }
    }

    public void repaint(String newColor) {
        color = newColor;
        System.out.println("Поменялся цвет коробки: " + newColor);
    }

    public void printInfo() {
        System.out.println("Ширина корробки: " + width + ", высота " + height + ", глубина " + depth);
        System.out.println("Цвет: " + color);
        System.out.println("Коробка " + (isOpen ? "открыта" : "закрыта"));
        if (item != null) {
            System.out.println("В коробке находится: " + item);
        } else {
            System.out.println("Коробка пуста");
        }
    }

    public void addItem(String newItem) {
        if (isOpen) {
            if (item == null) {
                item = newItem;
                System.out.println(newItem + " добавлен в коробку");
            } else {
                System.out.println("В коробке уже есть этот предмет");
            }
        } else {
            System.out.println("Невозможно добавить. Коробка закрыта");
        }
    }

    public void removeItem() {
        if (isOpen) {
            if (item != null) {
                System.out.println(item + " удалено из коробки");
                item = null;
            } else {
                System.out.println("Коробка пуста");
            }
        } else {
            System.out.println("Нельзя удалить из коробки, она закрыта");
        }
    }
}