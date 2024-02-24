package ru.ogai.java.basic.homeworks.homeworks1;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        //int data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        //int a = 7;
        //int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue += delta;
            System.out.println(initValue);
        } else {
            initValue -= delta;
            System.out.println(initValue);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5: ");
        int choice = scanner.nextInt();

        Random random = new Random();
        int arg1 = random.nextInt(100);
        int arg2 = random.nextInt(50);
        int arg3 = random.nextInt(120);

        if (choice == 1) {
            greetings();
        } else if (choice == 2) {
            checkSign(arg1, arg2, arg3);
        } else if (choice == 3) {
            selectColor(arg1);
        } else if (choice == 4) {
            compareNumbers(arg1, arg2);
        } else if (choice == 5) {
            addOrSubtractAndPrint(arg1, arg2, true);
        } else {
            System.out.println("Неверный выбор.");
        }
    }
}
