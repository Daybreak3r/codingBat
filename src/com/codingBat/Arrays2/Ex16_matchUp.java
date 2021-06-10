package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex16_matchUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums1 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums2 = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int score = Math.abs(nums1[i] - nums2[i]);
            if (nums1[i] != nums2[i] && score <= 2) {
                count++;
            }
        }
        System.out.printf("matchUp(%s, %s) -> %d", Arrays.toString(nums1), Arrays.toString(nums2), count);
    }
}
