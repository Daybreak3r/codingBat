package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class commonEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean hasCommonEnd = false;

        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            hasCommonEnd = true;
        }

        System.out.printf("commonEnd(%s, %s) -> %b", Arrays.toString(a), Arrays.toString(b), hasCommonEnd);
    }
}
