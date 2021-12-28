package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex06Makes10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean result = makes10(a, b);
        System.out.println(result);
    }

    public static boolean makes10(int a, int b) {
        return (a + b == 10) || (a == 10) || (b == 10);
    }
}
