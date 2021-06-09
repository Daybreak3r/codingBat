package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08_sum28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumOfTwos = 0;
        boolean isEight = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                sumOfTwos += 2;
            }
        }
        if (sumOfTwos == 8) {
            isEight = true;
        }
        System.out.printf("sum28(%s) -> %b", Arrays.toString(array), isEight);
    }
}
