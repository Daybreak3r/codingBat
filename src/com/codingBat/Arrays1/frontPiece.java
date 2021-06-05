package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class frontPiece {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] newNumbers;

        if (numbers.length >= 2) {
            newNumbers = new int[2];
            newNumbers[0] = numbers[0];
            newNumbers[1] = numbers[1];
        } else {
            newNumbers = new int[numbers.length];
            newNumbers[0] = numbers[0];
        }
        System.out.printf("frontPiece(%s) -> %s", Arrays.toString(numbers), Arrays.toString(newNumbers));
    }
}
