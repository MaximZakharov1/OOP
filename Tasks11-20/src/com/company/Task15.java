package com.company;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Введите поочерёдно три целочисленных аргумента:");
        Scanner input1= new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        try {
            a = Integer.valueOf(input1.nextLine());
            b = Integer.valueOf(input2.nextLine());
            c = Integer.valueOf(input3.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Аргументы должны быть заданы целыми числами!");
            return;
        }
            System.out.println("Количество целых чисел, имеющих одинаковое значение: " + equal(a,b,c));
    }
    public static int equal(int a, int b, int c) {
        int k=0;
        if ((a==b)||(a==c)||(b==c)) {
            k=2;
        }
        if ((a==b)&&(b==c)) {
            k=3;
        }
        return k;
    }
}