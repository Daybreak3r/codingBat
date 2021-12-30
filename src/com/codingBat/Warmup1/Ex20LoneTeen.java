package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex20LoneTeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("loneTeen(%d, %d) -> %b", a, b, loneTeen(a, b));
    }

    public static boolean loneTeen(int a, int b) {
        return ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19)) || (!(a >= 13 && a <= 19) && (b >= 13 && b <= 19));
    }
}
