package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex20_haveThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.printf("haveThree(%s) -> %b", Arrays.toString(array), hasThree(array));
    }

    private static boolean hasThree(int[] array) {
        if (array.length < 5) {
            return false;
        } else {
            for (int i = 0; i < array.length - 4; i++) {
                if (array[i] == 3 && array[i + 2] == 3 && array[i + 4] == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
