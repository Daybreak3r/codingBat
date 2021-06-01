package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class middleWay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] firstArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] middleArray = new int[2];
        middleArray[0] = firstArray[1];
        middleArray[1] = secondArray[1];

        System.out.printf("middleWay(%s), %s) -> %s", Arrays.toString(firstArray), Arrays.toString(secondArray), Arrays.toString(middleArray));
    }
}
