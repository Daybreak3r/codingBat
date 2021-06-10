package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12_fizzArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        String[] fizzLine = new String[n];

        for (int i = 0; i < fizzLine.length; i++) {
            fizzLine[i] = String.valueOf(i);
        }

        System.out.printf("fizzArray2(%d) -> %s", n, Arrays.toString(fizzLine));
    }
}
