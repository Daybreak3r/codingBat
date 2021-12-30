package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex11frontBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String result = frontBack(str);
        System.out.printf("frontBack(\"%s\") -> \"%s\"", str, result);
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char first = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            char last = str.charAt(0);
            return first + middle + last;
        }
    }
}
