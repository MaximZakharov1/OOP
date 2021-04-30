package com.company;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Введите исходную строку:");
        Scanner input= new Scanner(System.in);
        String s = input.nextLine ();
        System.out.println("Исходная строка в обратном порядке: " + reverse(s));
    }
    public static String reverse(String s) {
        String s1="";
        for (int i=s.length()-1;i>=0;i--) {
            s1 += s.charAt(i);
        }
        return s1;
    }
}
