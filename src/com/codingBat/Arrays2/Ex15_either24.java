package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15_either24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean doubleTwo = false;
        boolean doubleFour = false;
        boolean eitherNum = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                doubleTwo = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                doubleFour = true;
            }
            if ((doubleTwo && doubleFour) || (!doubleFour && !doubleTwo)) {
                eitherNum = false;
            } else {
                eitherNum = true;
            }
        }
        System.out.printf("either24(%s) -> %b", Arrays.toString(nums), eitherNum);
    }
}
