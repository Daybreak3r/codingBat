package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex15front22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.printf("front22(%s) -> %s", str, front22(str));
    }

    public static String front22(String str) {
        String temp;
        if (str.length() >= 2) {
            temp = str.substring(0, 2);
        } else {
            if (str.length() == 2) {
                temp = str.substring(0, 1);
            } else {
                temp = str.substring(0);
            }
        }
        return temp + str + temp;
    }
}
