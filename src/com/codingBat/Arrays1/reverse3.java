package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class reverse3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] newArr = new int[arr.length];
        newArr[0] = arr[2];
        newArr[1] = arr[1];
        newArr[2] = arr[0];

        System.out.printf("reverse3(%s) -> %s", Arrays.toString(arr), Arrays.toString(newArr));
    }
}
