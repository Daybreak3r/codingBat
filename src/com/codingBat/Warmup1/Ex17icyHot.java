package com.codingBat.Warmup1;

import java.util.Scanner;

public class Ex17icyHot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp1 = scanner.nextInt();
        int temp2 = scanner.nextInt();
        System.out.printf("icyHot(%d, %d) -> %b", temp1, temp2, icyHot(temp1, temp2));
    }

    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }
}
