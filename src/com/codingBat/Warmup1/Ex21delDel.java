package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex21delDel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.printf("delDel(%s) -> %s", str, delDel(str));
    }

    public static String delDel(String str) {
        if (str.length() >= 4) {
            String temp = str.substring(1, 4);
            if (temp.equalsIgnoreCase("del")) {
                return str.replace(temp, "");
            }
        }
        return str;
    }
}
