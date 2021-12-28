package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex05ParrotTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean talking = scanner.nextBoolean();
        int hour = scanner.nextInt();
        boolean result = parrotTrouble(talking, hour);
        System.out.println(result);
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if ((hour < 7 || hour > 20) && talking){
            return true;
        }
        return false;
    }
}
