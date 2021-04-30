package com.company;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        System.out.println("Введите исходную строку:");
        Scanner input= new Scanner(System.in);
        String s = input.nextLine ();
        System.out.println("Имеет ли исходная строка одинаковое количество x и o? " + getXO(s));
    }
    public static boolean getXO(String s) {
       int x=0, o=0;
        for (int i=0;i<s.length();i++) {
            if ((s.charAt(i)=='x')||(s.charAt(i)=='X')) {x++;}
            if ((s.charAt(i)=='o')||(s.charAt(i)=='O')) {o++;}
        }
        if (x==o) {return true;}
        else {return false;}
    }
}
