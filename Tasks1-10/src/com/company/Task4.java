package com.company;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int a;
        System.out.println("Введите исходное целое число:");
        Scanner input=new Scanner(System.in);
        try {
            a = Integer.valueOf(input.nextLine ());
            }
        catch (NumberFormatException e) {
            System.err.println("Программа работает только с целыми числами!");
            return;
        }
        if (divisibleByFive(a)==true) {
            System.out.println("Исходное число равномерно делится на 5!");
        }
        else {
            System.out.println("Исходное число неравномерно делится на 5!");
        }
    }
    public static boolean divisibleByFive(int a) {
        if (a%5==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
