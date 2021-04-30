package com.company;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Введите поочерёдно зарплаты трёх программистов:");
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
        System.out.println("Разница между заработными платами самого высокооплачиваемого и низкооплачиваемого программиста: " + programmers(a,b,c));
    }
    public static int programmers(int a, int b, int c) {
        int max=a, min=a;
        if ((b>=max)||(b<=min)) {
            if (b>=max) {max=b;}
            if (b<=min) {min=b;}
        }
        if ((c>=max)||(c<=min)) {
            if (c>=max) {max=c;}
            if (c<=min) {min=c;}
        }
        return max-min;
    }
}
