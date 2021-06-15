package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex19_modThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counterEven = 0;
        int counterOdd = 0;
        boolean threeInARow = false;
        if (array.length < 3) {
            threeInARow = false;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    counterEven++;
                    if (counterEven >= 3) {
                        threeInARow = true;
                        break;
                    }
                }
                if (array[i] % 2 != 0) {
                    counterOdd++;
                    if (counterOdd >= 3) {
                        threeInARow = true;
                        break;
                    }
                }

            }
        }
        System.out.printf("modThree(%s) -> %b", Arrays.toString(array), threeInARow);
    }
}
