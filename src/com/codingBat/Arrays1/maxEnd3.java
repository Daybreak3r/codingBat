package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class maxEnd3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] entry = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] newEntry = new int[entry.length];
        int maxEntry = 0;
        if (entry[0] > entry[entry.length - 1]) {
            maxEntry = entry[0];
        } else {
            maxEntry = entry[2];
        }
        for (int i = 0; i < entry.length; i++) {
            newEntry[i] = maxEntry;
        }
        System.out.printf("maxEnd3(%s) -> %s", Arrays.toString(entry), Arrays.toString(newEntry));
    }
}
