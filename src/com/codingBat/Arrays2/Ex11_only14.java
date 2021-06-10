package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11_only14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean hasOnlyOneOrFour = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) {
                hasOnlyOneOrFour = false;
            }
        }
        System.out.printf("only14(%s) -> %b", Arrays.toString(array), hasOnlyOneOrFour);
    }
}
