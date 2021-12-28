package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex10MissingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = scanner.nextInt();
        String result = missingChar(str, n);
        System.out.printf("missingChar(\"%s\", %d) -> \"%s\"", str, n, result);
    }

    public static String missingChar(String str, int n) {
        String a = str.substring(0, n);
        String b = str.substring(n + 1, str.length());
        return a + b;
    }
}
