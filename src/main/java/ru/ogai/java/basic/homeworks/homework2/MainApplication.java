package ru.ogai.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainApplication {
    public static void printStringMultipleTimes(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public static void sumElementsGreaterThan5(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArrayWithNumber(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void incrementArrayElements(int a, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printSumOfLargerHalf(int arr[]) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length - 1; i > arr.length / 2; i--) {
            sum2 += arr[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма первой половины массива больше");
        } else {
            System.out.println("Сумма второй половины массива больше");
        }
    }

    public static void main(String[] args) {
        printStringMultipleTimes(3, "Hello");

        int[] numbers = {2, 6, 8, 3, 10};
        sumElementsGreaterThan5(numbers);

        int[] arrayToFill = new int[5];
        fillArrayWithNumber(7, arrayToFill);

        incrementArrayElements(3, numbers);

        printSumOfLargerHalf(numbers);

    }
}
