package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class make2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] newArray = new int[2];

        int counter = 0;
        int i = 0;
        while (counter < 2 && i < a.length) {
            newArray[counter] = a[i];
            counter++;
            i++;
        }
        i = 0;
        while (counter < 2 && i < b.length) {
            newArray[counter] = b[i];
            counter++;
            i++;
        }
        System.out.printf("make2(%s, %s) -> %s", Arrays.toString(a), Arrays.toString(b), Arrays.toString(newArray));
    }
}
