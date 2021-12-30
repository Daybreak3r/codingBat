package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex13backAround {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.printf("backAround(%s) -> %s", str, backAround(str));
    }

    public static String backAround(String str) {
        char temp = str.charAt(str.length() - 1);
        return temp + str + temp;
    }
}
