package com.company;

import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
       System.out.println("Введите количество исходных строк");
     Scanner input = new Scanner(System.in);
     int count = input.nextInt();
     System.out.println("Количество строк: "+count);
     for (int i=0;i<count;i++) {
         Scanner s = new Scanner(System.in);
         String slovo = s.nextLine();
         if (isPalindrome(slovo)==true) {
             System.out.println(slovo + " - палиндром");
         }
         else {System.out.println(slovo + " - не палиндром");}
     }
   }
   public static String reverseString(String slovo) {
       String s="";
       for (int i=slovo.length()-1;i>=0;i--) {
           s += slovo.charAt(i);
       }
       return s;
   }
   public static boolean isPalindrome (String slovo) {
       if (reverseString(slovo).equals(slovo)) {
           return true;
       }
       else {return false;}
   }
}
