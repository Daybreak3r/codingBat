package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex09NotString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = notString(str);
        System.out.printf("notString(\"%s\") -> \"%s\"", str, result);
    }

    public static String notString(String str) {
        String ex;
        if (str.length() >= 3) {
            ex = str.substring(0, 3);
        } else {
            ex = str;
        }
        if (!ex.equals("not")) {
            return String.format("not %s", str);
        }
        return str;
    }
}
