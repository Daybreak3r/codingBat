package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex02MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean aSmile = scanner.nextBoolean();
        boolean bSmile = scanner.nextBoolean();
        boolean monkeyTrouble = monkeyTrouble(aSmile, bSmile);
        System.out.println(monkeyTrouble);
    }

    private static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)){
            return true;
        }
        return false;
        // simplified is "return aSmile == bSmile"
    }
}
