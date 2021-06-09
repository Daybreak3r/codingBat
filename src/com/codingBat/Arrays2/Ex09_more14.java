package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_more14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumOfOnes = 0;
        int sumOfFours = 0;
        boolean areMore = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                sumOfOnes++;
            }
            if (array[i] == 4) {
                sumOfFours++;
            }
        }
        if (sumOfFours >= sumOfOnes) {
            areMore = false;
        }
        System.out.printf("more14(%s) -> %b", Arrays.toString(array), areMore);
    }
}
