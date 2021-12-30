package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex14or35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.printf("or35(%d) -> %b", n, or35(n));
    }

    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
