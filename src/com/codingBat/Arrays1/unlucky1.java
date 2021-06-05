package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class unlucky1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isUnlucky = false;

        int[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 1 && numbers[i + 1] == 3) {
                isUnlucky = true;
                break;
            }
        }
        System.out.printf("unlucky1(%s) -> %b", Arrays.toString(numbers), isUnlucky);
    }
}
