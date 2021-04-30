package com.company;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int n;
        System.out.println("Введите количество элементов исходного массива:");
        Scanner input = new Scanner(System.in);
        try {
            n = Integer.valueOf(input.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Количество элементов массива должно быть задано положительным целым числом!");
            return;
        }
        if (n<=0) {
            System.err.println("Количество элементов массива должно быть задано положительным целым числом!");
        } else {
            int massiv[];
            massiv = new int[n];
            System.out.println("Введите поочерёдно целочисленные элементы массива:");
            for (int i=0; i<n; i++) {
                Scanner input1 = new Scanner(System.in);
                try {
                    massiv[i] = Integer.valueOf(input1.nextLine());
                } catch (NumberFormatException e) {
                    System.err.println("Элементы массива должны быть целочисленными!");
                    return;
                }
            }
            System.out.println("Разница между наибольшим и наименьшим элементами массива: " + differenceMaxMin(massiv, n));
        }
    }
    public static int differenceMaxMin(int[] massiv, int n) {
        int min=massiv[0], max=massiv[0];
        for (int i=0;i<n;i++) {
            if (massiv[i]<min) {
                min=massiv[i];
            }
            if (massiv[i]>=max) {
                max=massiv[i];
            }
        }
        return max-min;
    }
}
