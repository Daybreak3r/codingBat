package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class midThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] middleThree = new int[3];

        middleThree[0] = numbers[numbers.length / 2 - 1];
        middleThree[1] = numbers[numbers.length / 2];
        middleThree[2] = numbers[numbers.length / 2 + 1];

        System.out.printf("middleThree(%s) -> %s", Arrays.toString(numbers), Arrays.toString(middleThree));
    }
}
