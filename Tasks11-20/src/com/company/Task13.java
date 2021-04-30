package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int price, skidka;
        System.out.println("Введите 2 исходных целых неотрицательных числа по отдельности в указанном порядке: исходная цена, процент скидки");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        try {
            price = Integer.valueOf(input1.nextLine());
            skidka = Integer.valueOf(input2.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Исходные значения должны быть заданы неотрицательными целыми числами!");
            return;
        }
        if ((price<0)||(skidka<0)) {
            System.err.println("Исходные значения должны быть заданы неотрицательными целыми числами!");
        } else {
            System.out.println("Конечная цена после скидки: " + discount(price,skidka));
        }
    }
    public static double discount(int price, int skidka){
        double price1=price;
        return price1-(price1/100)*skidka;
    }
}