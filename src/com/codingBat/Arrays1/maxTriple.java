package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class maxTriple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] maxTriple = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int biggestNum = Integer.MIN_VALUE;
        for (int i = 0; i < maxTriple.length; i++) {
            if (maxTriple[i] > biggestNum) {
                biggestNum = maxTriple[i];
            }
        }
        System.out.printf("maxTriple(%s) -> %d", Arrays.toString(maxTriple), biggestNum);
    }
}
