package com.company;

public class Primes {

    public static void main(String[] args) {
        for (int n=2; n<100; n++)
            if (isPrime(n)==true)
            {System.out.print(n+"; ");}
    }
    public static boolean isPrime (int n) {
        int k=0;
        for (int i=2; i<n; i++) {
        if (n%i==0) {
            k++;
        }
        }
        if (k>0)
        {return false;}
            else {return true;}
    }
}
