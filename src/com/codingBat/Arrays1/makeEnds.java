package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class makeEnds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] init = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] newArray = new int[2];

        newArray[0] = init[0];
        newArray[1] = init[init.length - 1];

        System.out.printf("makeEnds(%s) -> %s", Arrays.toString(init), Arrays.toString(newArray));
    }
}
