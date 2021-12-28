package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex08PosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean negative = scanner.nextBoolean();
        boolean result = posNeg(a, b, negative);
        System.out.printf("posNeg(%d, %d, %b) -> %b", a, b, negative, result);
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            return ((a < 0 && b > 0) || (b < 0 && a > 0));
        } else {
            return (a < 0 && b < 0);
        }
    }
}
