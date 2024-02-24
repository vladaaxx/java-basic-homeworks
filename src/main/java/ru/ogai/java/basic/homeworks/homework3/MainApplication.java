package ru.ogai.java.basic.homeworks.homework3;

import java.util.Arrays;

public class MainApplication {
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void zeroOutDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
                arr[i][arr.length - 1 - i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int sumOfSecondRow(int[][] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < arr[1].length; i++) {
            sum += arr[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array = {{-2, 5, 8}, {3, -4, 7}, {1, 0, -6}};
        System.out.println(sumOfPositiveElements(array));
        printSquare(5);
        zeroOutDiagonal(array);
        int[][] array1 = {{-2, 5, 8}, {3, -4, 7}, {1, 0, -6}};
        System.out.println(findMax(array1));
        System.out.println(sumOfSecondRow(array1));
    }
}
