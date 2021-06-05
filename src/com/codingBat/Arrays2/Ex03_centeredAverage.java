package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_centeredAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
    }
}
