package com.skillnext;
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // how many numbers you want

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;   // next term
            System.out.print(c + " ");

            a = b;   // move forward
            b = c;
        }
    }
}
