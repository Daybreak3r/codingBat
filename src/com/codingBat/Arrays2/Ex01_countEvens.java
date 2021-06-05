package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_countEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens++;
            }
        }
        System.out.printf("countEvens(%s) -> %d", Arrays.toString(numbers), evens);
    }
}
