package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex25_shiftLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] original = arr.clone();
        if (arr.length < 1) {
            System.out.printf("shiftLeft(%s) -> %s", Arrays.toString(original), Arrays.toString(arr));
        } else {
            int firstNumber = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = firstNumber;
            System.out.printf("shiftLeft(%s) -> %s", Arrays.toString(original), Arrays.toString(arr));
        }
    }
}
