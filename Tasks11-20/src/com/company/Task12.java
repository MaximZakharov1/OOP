package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите имя и фамилию человека: ");
        Scanner input = new Scanner (System.in);
        String s = input.nextLine ();
        int k=0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)==32) {
                k++;
            }
        }
        if (k!=1) {
            System.err.println("Введённая строка не соответствует имени и фамилии одного человека!");
            return;
        }
        System.out.println("Замена имени и фамилии: " + nameShuffle(s));
    }
    public static String nameShuffle(String s){
        String name = ""; String familia = ""; int i = 0;
        while (s.charAt(i) != 32){
            name = name + s.charAt(i);
            i++;
        }
        i++;
        while(i != s.length()){
            familia = familia + s.charAt(i);
            i++;
        }
        return (familia + " " + name);
    }
}