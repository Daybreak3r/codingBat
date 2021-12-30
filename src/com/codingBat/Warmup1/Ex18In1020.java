package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex18In1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("in1020(%d, %d) -> %b", a, b, in1020(a, b));
    }

    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
}
