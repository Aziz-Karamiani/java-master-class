package com.basics.loops;

public class Main {
    public static void main(String[] args) {
        // For i loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello -> " + i);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < 10; i += 4) {
            System.out.println("Hello -> " + i);
        }

        // For i loop (reverse)
        for (int i = 10; i >= 0; i--) {
            System.out.println("Hello -> " + i);
        }
        System.out.println("-----------------------");
        for (int i = 10; i >= 0; i -= 4) {
            System.out.println("Hello -> " + i);
        }

        // While loop
        System.out.println("-----------------------");
        boolean isOk = true;
        int j = 0;
        while (isOk) {
            System.out.println("Hello From While Loop -> " + j);
            if (j == 10) {
                isOk = false;
            }
            j++;
        }

        // Do While loop
        boolean isAdult = true;
        do {
            System.out.println("Hello");
            isAdult = false;
        } while(isAdult);
    }
}
