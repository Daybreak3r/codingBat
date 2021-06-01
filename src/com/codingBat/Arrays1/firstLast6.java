package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class firstLast6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (arr[0] == 6 || arr[arr.length - 1] == 6) {
            System.out.printf("firstLast6(%s) -> true", Arrays.toString(arr));
        } else {
            System.out.printf("firstLast6(%s) -> false", Arrays.toString(arr));
        }
    }
}
