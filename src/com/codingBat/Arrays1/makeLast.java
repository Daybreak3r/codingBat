package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class makeLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] newArr = new int[arr.length * 2];

        newArr[newArr.length - 1] = arr[arr.length - 1];

        System.out.printf("makeLast(%s) -> %s", Arrays.toString(arr), Arrays.toString(newArr));
    }
}
