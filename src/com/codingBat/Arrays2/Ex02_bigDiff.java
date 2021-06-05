package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_bigDiff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbArr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < numbArr.length; i++) {
            if (numbArr[i] > maxNum) {
                maxNum = numbArr[i];
            }
            if (numbArr[i] < minNum) {
                minNum = numbArr[i];
            }
        }
        System.out.printf("bigDiff(%s) -> %d", Arrays.toString(numbArr), maxNum - minNum);
    }
}
