package com.company;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        boolean x,y;
        int a,b;
        System.out.println("Задайте логическое значение первой переменной (0-false, 1-true):");
        Scanner input=new Scanner(System.in);
        try {
             a = Integer.valueOf(input.nextLine ());
            }
        catch (NumberFormatException e) {
            System.err.println("Программа работает только с 0 и 1!");
            return;
        }
        if ((a!=0)&&(a!=1)) {
            System.err.println("Программа работает только с 0 и 1!");
            return;
        }
        if (a==1) {
            x=true;
        }
        else {
            x=false;
        }
        System.out.println("Задайте логическое значение второй переменной (0-false, 1-true):");
        Scanner input1=new Scanner(System.in);
        try {
            b = Integer.valueOf(input1.nextLine ());
        }
        catch (NumberFormatException e) {
            System.err.println("Программа работает только с 0 и 1!");
            return;
        }
        if ((b!=0)&&(b!=1)) {
            System.err.println("Программа работает только с 0 и 1!");
            return;
        }
        if (b==1) {
            y=true;
        }
        else {
            y=false;
        }
        System.out.println(and(x,y));
    }
    public static boolean and(boolean x, boolean y) {
        return (x&&y);
    }
}