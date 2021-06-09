package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_sum13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 13) {
                sum += numbers[i];
            } else {
                i += 1;
            }
        }
        System.out.printf("sum13(%s) -> %d", Arrays.toString(numbers), sum);
    }
}
