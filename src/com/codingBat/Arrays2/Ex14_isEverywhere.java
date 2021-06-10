package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14_isEverywhere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int val = Integer.parseInt(input.nextLine());

        boolean isEverywhere = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                isEverywhere = false;
            }
        }
        System.out.printf("isEverywhere(%s), %d) -> %b", Arrays.toString(nums), val, isEverywhere);
    }
}
