package com.company;

import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите 3 исходных числа по отдельности в указанном порядке: количество побед, ничьих, поражений");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        try {
            a = Integer.valueOf(input1.nextLine());
            b = Integer.valueOf(input2.nextLine());
            c = Integer.valueOf(input3.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Исходные значения должны быть заданы неотрицательными целыми числами!");
            return;
        }
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.err.println("Исходные значения должны быть заданы неотрицательными целыми числами!");
        } else {
            System.out.println("Количество очков, набранных футбольной командой сейчас: " + footballPoints(a, b, c));
        }
    }

    public static int footballPoints(int a, int b, int c) {
        return a * 3 + b;
    }
}

