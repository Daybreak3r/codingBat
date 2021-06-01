package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class fix23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] original = new int[arr.length];
        for (int i = 0; i < original.length; i++) {
            original[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 && arr[i + 1] == 3) {
                arr[i + 1] = 0;
            }
        }
        System.out.printf("fix23(%s) -> %s", Arrays.toString(original), Arrays.toString(arr));
    }
}
