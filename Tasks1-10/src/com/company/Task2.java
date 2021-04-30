package com.company;

import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        int a,b;
        System.out.println("Введите целое число 2-х очков:");
        Scanner input=new Scanner(System.in);
        try {
            a = Integer.valueOf(input.nextLine ());
        }
        catch (NumberFormatException e) {
            System.err.println("Количество забитых очков должно быть задано неотрицательным целым числом!");
            return;
        }
        System.out.println("Введите целое число 3-х очков:");
        Scanner input1=new Scanner(System.in);
        try {
             b = Integer.valueOf(input1.nextLine ());
            }
        catch (NumberFormatException e) {
            System.err.println("Количество забитых очков должно быть задано неотрицательным целым числом!");
            return;
        }
        if ((a<0)||(b<0)) {
            System.err.println("Количество забитых очков должно быть задано неотрицательным целым числом!");
        }
        else{
            System.out.println ("Окончательное число очков для команды: " + points(a,b));
        }
    }
    public static int points(int a,int b) {
        return a*2+b*3;
    }
}