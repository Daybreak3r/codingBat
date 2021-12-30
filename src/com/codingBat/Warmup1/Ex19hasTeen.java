package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex19hasTeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.printf("hasTeen(%d, %d, %d) -> %b", a, b, c, hasTeen(a, b, c));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }
}
