package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите целое число минут");
        Scanner input=new Scanner(System.in);
        try {
            int a = Integer.valueOf(input.nextLine ());
        System.out.println ("Число секунд в исходном числе минут: " + convert(a));}
        catch (NumberFormatException e) {
            System.err.println("Программа работает только с целыми числами!");
        }
    }
    public static int convert(int a) {
        return a*60;
    }
}
