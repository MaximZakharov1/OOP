package com.company;

import java.util.Scanner;

public class Task11 {


    public static void main(String[] args) {
        int num, dlina;
        System.out.println("Введите 2 исходных целых положительных числа по отдельности в указанном порядке: номер дома, длина улицы");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        try {
            num = Integer.valueOf(input1.nextLine());
            dlina = Integer.valueOf(input2.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Исходные значения должны быть заданы положительными целыми числами!");
            return;
        }
        if ((num<=0)||(dlina<=0)) {
            System.err.println("Исходные значения должны быть заданы положительными целыми числами!!");
            return;
        }
            if (2*dlina<num) {
            System.err.println("Номер дома не соотвествует длине улицы!");
            return;
            }
                System.out.println("Номер дома на противоположной стороне: " + oppositeHouse(num,dlina));
        }

    public static int oppositeHouse(int num, int dlina) {
        int ch[];
        ch = new int[dlina];
        int nech[];
        nech = new int[dlina];
        int i;
        int a = (dlina * 2) - 1;
        int b = 2;
        for (i = 0; i < dlina; i++) {
            nech[i] = a;
            a = a - 2;
        }
        for (i = 0; i < dlina; i++) {
            ch[i] = b;
            b = b + 2;
        }
        if (num % 2 == 0) {
            for (i = 0; i < dlina; i++) {
                if (ch[i] == num) {
                    a = nech[i];
                }
            }
        } else {
            for (i = 0; i < dlina; i++) {
                if (nech[i] == num) {
                    a = ch[i];
                }
            }
        }
        return a;
    }
}