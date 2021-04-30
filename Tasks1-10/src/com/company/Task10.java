package com.company;

import java.util.Scanner;

public class Task10 {


    public static void main(String[] args) {
        int delimoe, delitel;
        System.out.println("Введите 2 исходных целых числа по отдельности в указанном порядке: делимое, делитель");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        try {
            delimoe = Integer.valueOf(input1.nextLine());
            delitel = Integer.valueOf(input2.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Исходные значения должны быть заданы целыми числами!");
            return;
        }
        if (delitel==0) {
            System.err.println("На ноль делить нельзя!");
        } else {
            System.out.println("Остаток, полученный при делеии исходных чисел: " + mod(delimoe,delitel));
        }
    }

    public static int mod(int delimoe, int delitel) {
        return delimoe-(delimoe/delitel)*delitel;
    }
}