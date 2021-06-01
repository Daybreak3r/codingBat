package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class no23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] newArray = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean hasNo2or3 = true;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 2 || newArray[i] == 3) {
                hasNo2or3 = false;
            }
        }
        System.out.printf("no23(%s) -> %b", Arrays.toString(newArray), hasNo2or3);
    }
}
