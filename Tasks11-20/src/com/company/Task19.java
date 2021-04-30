package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        System.out.println("Введите исходную строку:");
        Scanner input= new Scanner(System.in);
        String s = input.nextLine ();
        System.out.println (bomb(s));
    }
    public static String bomb(String s) {
        int b, k=0; String slovo=""; boolean nal=false; int i; String s1 = "ПРИГНИСЬ!"; String s2 = "Расслабься, бомбы нет";
        s=s.toLowerCase();
        nal = s.contains("bomb");
        if (nal==true) {return s1;}
        else {
            nal = s.contains("бомба");
            if (nal==true) {return s1;}
            else {return s2;}
        }
    }
}
