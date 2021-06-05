package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class swapEnds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] original = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            original[i] = numbers[i];
        }
        int temp = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = numbers[0];
        numbers[0] = temp;

        System.out.printf("swapEnds(%s) -> %s", Arrays.toString(original), Arrays.toString(numbers));
    }
}
