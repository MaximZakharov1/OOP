package com.company;

import java.util.Scanner;

public class Task7 {


    public static void main(String[] args) {
        int a;
        System.out.println("Введите исходное целое число:");
        Scanner input = new Scanner(System.in);
        try {
            a = Integer.valueOf(input.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Программа работает с целыми числами!");
            return;
        }
            System.out.println("Квадрат исходного числа: " + squared(a));
    }

    public static int squared(int a) {
        return a*a;
    }
}