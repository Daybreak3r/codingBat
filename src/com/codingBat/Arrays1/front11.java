package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class front11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] newArray;
        if (a.length != 0 && b.length != 0) {
            newArray = new int[]{a[0], b[0]};
        } else {
            newArray = new int[1];
            if (a.length == 0) {
                newArray[0] = b[0];
            } else {
                newArray[0] = a[0];
            }
        }
        System.out.printf("front11(%s, %s) -> %s", Arrays.toString(a), Arrays.toString(b), Arrays.toString(newArray));
    }
}
