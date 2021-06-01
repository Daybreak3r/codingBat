package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class biggerTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr1 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumArr1 = 0;
        int sumArr2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sumArr1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sumArr2 += arr2[i];
        }
        if (sumArr1 > sumArr2) {
            System.out.printf("biggerTwo(%s, %s) -> %s", Arrays.toString(arr1), Arrays.toString(arr2), Arrays.toString(arr1));
        } else {
            System.out.printf("biggerTwo(%s, %s) -> %s", Arrays.toString(arr1), Arrays.toString(arr2), Arrays.toString(arr2));
        }
    }
}
