package com.basics.arrays;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Arrays.fill(numbers, 100);
        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers));

        System.out.println("Dynamic array");
        String[] names = {"Ali", "Reza", "Karim"};
        System.out.println(Arrays.toString(names));
    }
}
