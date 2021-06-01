package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class rotateLeft3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int temp = arr[2];
        arr[2] = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.printf("rotateLeft3 -> %s", Arrays.toString(arr));
    }
}
