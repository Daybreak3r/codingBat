package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        if (arr.length == 1) {
            System.out.println("Array is only with index 0");
        } else {
            sum = arr[0] + arr[1];
            System.out.printf("sum2(%s) -> %d", Arrays.toString(arr), sum);
        }
    }
}
