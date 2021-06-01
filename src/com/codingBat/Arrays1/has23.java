package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class has23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] newArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean has2or3 = false;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 2 || newArray[i] == 3) {
                has2or3 = true;
            }
        }
        System.out.printf("has23(%s) -> %b", Arrays.toString(newArray), has2or3);
    }
}
