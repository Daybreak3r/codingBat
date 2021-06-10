package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex17_has77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean hasSevens = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                hasSevens = true;
            }
            if (i <= nums.length - 3 && nums[i] == 7 && nums[i + 2] == 7) {
                hasSevens = true;
            }
        }
        System.out.println(hasSevens);
    }
}
