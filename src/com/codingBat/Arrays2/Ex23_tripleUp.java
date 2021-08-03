package com.codingBat.Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex23_tripleUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        boolean tripleUp = false;
        for (int i = 0; i <= numbers.length - 3; i++) {
            if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) {
                tripleUp = true;
            }
        }
        System.out.printf("tripleUp(%s) -> %b", Arrays.toString(numbers), tripleUp);
    }
}
