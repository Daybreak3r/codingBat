package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class plusTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayOne = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrayTwo = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] connected = new int[4];
        connected[0]=arrayOne[0];
        connected[1]=arrayOne[1];
        connected[2]=arrayTwo[0];
        connected[3]=arrayTwo[1];
        System.out.printf("plusTwo(%s, %s) -> %s", Arrays.toString(arrayOne),
                Arrays.toString(arrayTwo), Arrays.toString(connected));
    }
}
