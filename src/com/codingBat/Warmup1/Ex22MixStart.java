package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex22MixStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.printf("mixStart(%s) -> %b", str, mixStart(str));
    }

    public static boolean mixStart(String str) {
        if (str.length() > 2) {
            String temp = str.substring(1, 3);
            return temp.equalsIgnoreCase("ix");
        }
        return false;
    }
}
