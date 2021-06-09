package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_sum67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isInRange = false;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 6) {
                isInRange = true;
            }
            if (!isInRange) {
                sum += number[i];
            }
            if (isInRange && number[i] == 7) {
                isInRange = false;
            }
        }
        System.out.printf("sum67(%s) -> %d", Arrays.toString(number), sum);
    }
}
