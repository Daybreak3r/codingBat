package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_fizzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = Integer.parseInt(input.nextLine());
        int[] fizzArray = new int[number];

        for (int i = 0; i < fizzArray.length; i++) {
            fizzArray[i] = i;
        }
        System.out.printf("fizzArray(%d) -> %s", number, Arrays.toString(fizzArray));
    }
}
