package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex21_twoTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean doubleTwos = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                doubleTwos = true;
            }
        }
        System.out.printf("twoTwo(%s) -> %b", Arrays.toString(nums), doubleTwos);
    }
}
