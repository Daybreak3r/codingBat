package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class double23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counterFor2 = 0;
        int counterFor3 = 0;
        boolean hasDoubles = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                counterFor2++;
            }
            if (arr[i] == 3) {
                counterFor3++;
            }
        }
        if (counterFor2 == 2 || counterFor3 == 2) {
            hasDoubles = true;
        }
        System.out.printf("double23(%s) -> %b", Arrays.toString(arr), hasDoubles);
    }
}
