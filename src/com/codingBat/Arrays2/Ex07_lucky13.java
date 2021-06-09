package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07_lucky13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] luckyArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isLucky = true;

        for (int i = 0; i < luckyArray.length; i++) {
            if (luckyArray[i] == 1 || luckyArray[i] == 3) {
                isLucky = false;
            }
        }
        System.out.printf("lucky13(%s) -> %b", Arrays.toString(luckyArray), isLucky);
    }
}
