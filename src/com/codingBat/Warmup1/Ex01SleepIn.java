package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex01SleepIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean weekday = scanner.nextBoolean();
        boolean vacation = scanner.nextBoolean();
        boolean result = sleepIn(weekday, vacation);
        System.out.println(result);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;

    }
}
