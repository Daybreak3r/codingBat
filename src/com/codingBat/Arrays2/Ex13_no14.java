package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13_no14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean no1 = true;
        boolean no4 = true;
        boolean no14 = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                no1 = false;
            }
            if (array[i] == 4) {
                no4 = false;
            }
            if (!no4 && !no1) {
                no14 = false;
                break;
            }
        }
        System.out.printf("no14(%s) -> %b", Arrays.toString(array), no14);
    }
}
