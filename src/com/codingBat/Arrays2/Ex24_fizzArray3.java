package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex24_fizzArray3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int[] array = new int[end - start];
        for (int i = start; i < end; i++) {
            array[i - start] = i;
        }
        System.out.printf("fizzArray3(%d, %d) -> (%s)", start, end, Arrays.toString(array));
    }
}
