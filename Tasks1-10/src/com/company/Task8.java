package com.company;

import java.util.Scanner;

public class Task8 {


    public static void main(String[] args) {
        double prob, prize, pay;
        System.out.println("Введите 3 исходных аргумента по отдельности в указанном порядке: prob, prize, pay");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        try {
            prob = Double.valueOf(input1.nextLine());
            prize = Double.valueOf(input2.nextLine());
            pay = Double.valueOf(input3.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Исходные значения должны быть заданы положительными числами!");
            return;
        }
        if ((prob <= 0) || (prize <= 0) || (pay <= 0)) {
            System.err.println("Исходные значения должны быть заданы положительными числами!");
        } else {
            System.out.println("Чистая прибыль больше нуля? " + profitableGamble(prob, prize, pay));
        }
    }

    public static boolean profitableGamble(double prob, double prize, double pay) {
        if ((prob*prize-pay)>0) {
            return true;
        }
        else {
            return false;
        }
    }
}