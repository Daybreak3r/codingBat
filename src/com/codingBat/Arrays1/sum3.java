package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class sum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("sum3(%s) -> %d", Arrays.toString(arr), sum);
    }
}
