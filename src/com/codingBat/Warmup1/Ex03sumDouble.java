package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex03sumDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumDouble = sumDouble(a, b);
        System.out.println(sumDouble);

    }

    private static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return (a + b) * 2;
        }
    }
}
