package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class makeMiddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] middleTwo = new int[2];

        middleTwo[0] = number[number.length / 2 - 1];
        middleTwo[1] = number[number.length / 2];

        System.out.printf("makeMiddle(%s) -> %s", Arrays.toString(number), Arrays.toString(middleTwo));
    }
}
