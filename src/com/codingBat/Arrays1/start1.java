package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class start1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr1 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int startingOneCount = 0;
        if (arr1[0] == 1) {
            startingOneCount += 1;
        }
        if (arr2[0] == 1) {
            startingOneCount += 1;
        }
        System.out.printf("start1(%s, %s) -> %d", Arrays.toString(arr1), Arrays.toString(arr2), startingOneCount);
    }
}
