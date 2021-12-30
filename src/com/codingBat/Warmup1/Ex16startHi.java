package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex16startHi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.printf("startHi(%s) -> %b\n", str, startHi(str));
    }

    public static boolean startHi(String str) {
        return str.length() >= 2 && str.substring(0, 2).equalsIgnoreCase("hi");
    }
}
