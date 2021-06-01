package com.codingBat.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class sameFirstLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] entry = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean areSame = false;
        if (entry[0] == entry[entry.length-1]){
            areSame = true;
        }
        System.out.printf("sameFirstLast(%s) -> %b", Arrays.toString(entry), areSame);
    }
}
