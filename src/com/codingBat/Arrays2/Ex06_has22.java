package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06_has22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean hasNumbers = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 && array[i + 1] == 2) {
                hasNumbers = true;
            }
        }
        System.out.printf("has22(%s) -> %b", Arrays.toString(array), hasNumbers);
    }
}
