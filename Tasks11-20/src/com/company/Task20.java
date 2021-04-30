package com.company;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        System.out.println("Введите исходную строку №1:");
        Scanner input1= new Scanner(System.in);
        String s1 = input1.nextLine ();
        System.out.println("Введите исходную строку №2:");
        Scanner input2= new Scanner(System.in);
        String s2 = input2.nextLine ();
        System.out.println ("Совпадают ли суммы значений ASCII первой и второй строки? "+sameAscii(s1,s2));
    }
    public static boolean sameAscii(String s1, String s2) {
        int i,b, k1=0, k2=0;
        for (i=0;i<s1.length();i++) {
            b=(int) s1.charAt(i);
            k1=k1+b;
        }
        for (i=0;i<s2.length();i++) {
            b=(int) s2.charAt(i);
            k2=k2+b;
        }
        if (k1==k2) {return true;}
        else {return false;}
    }
}
