package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex12front3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String result = front3(str);
        System.out.printf("front3(%s) -> %s", str, result);
    }

    public static String front3(String str) {
        if (str.length() >= 3) {
            String threes = str.substring(0, 3);
            return threes + threes + threes;
        } else {
            return str + str + str;
        }
    }
}
