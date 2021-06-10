package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex18_has12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean hasOne = false;
        boolean hasBoth = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                hasOne = true;
            }
            if (hasOne) {
                if (nums[i] == 2) {
                    hasBoth = true;
                }
            }
        }
        System.out.printf("has12(%s) -> %b", Arrays.toString(nums), hasBoth);
    }
}
