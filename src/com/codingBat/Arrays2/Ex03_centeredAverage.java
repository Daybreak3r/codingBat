package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_centeredAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int biggestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > biggestNum) {
                biggestNum = number[i];
            }
            if (number[i] < smallestNum) {
                smallestNum = number[i];
            }
            sum += number[i];
        }
        int result = ((sum - smallestNum - biggestNum) / (number.length - 2));
        System.out.printf("centeredAverage(%s) -> %d", Arrays.toString(number), result);
    }
}
