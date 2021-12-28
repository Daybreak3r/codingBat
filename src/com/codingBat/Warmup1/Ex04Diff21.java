package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex04Diff21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = diff21(n);
        System.out.println(result);
    }

    public static int diff21(int n) {
        if (n < 21) {
            return Math.abs(n-21);
        } else {
            return (n-21)*2;
        }
    }
}
