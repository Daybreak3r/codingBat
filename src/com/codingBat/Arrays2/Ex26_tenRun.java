package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex26_tenRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        // didn't work
        System.out.println(Arrays.toString(arr));
    }
}
