package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex07NearHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = nearHundred(n);
        System.out.println(result);
    }

    public static boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10);
    }
}
