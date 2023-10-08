package com.basics.primitives;

public class Main {
    public static void main(String[] args) {
        // Primitives (Integer, Boolean, Char, Double)
        System.out.println("****** { Primitives (Integer, Boolean, Char, Double) } ******");
        int number1 = 10;
        int number2 = 3;
        int result = number1 + number2;
        System.out.println("Number1 + Number2 = " + result);

        boolean isAvailable = false;
        System.out.println(isAvailable);

        char a = 'A';
        System.out.println(a);

        double pi = 3.14;
        System.out.println(pi);

        // Math Operations
        /*
            +	Addition	Adds together two values	x + y
            -	Subtraction	Subtracts one value from another	x - y
            *	Multiplication	Multiplies two values	x * y
            /	Division	Divides one value by another	x / y
            %	Modulus	Returns the division remainder	x % y
            ++	Increment	Increases the value of a variable by 1	++x
            --	Decrement	Decreases the value of a variable by 1	--x
         */
        System.out.println("****** { Math Operations () } ******");
        System.out.println("Number1 + Number2 = " + (number1 + number2));
        System.out.println("Number1 - Number2 = " + (number1 - number2));
        System.out.println("Number1 * Number2 = " + (number1 * number2));
        System.out.println("Number1 / Number2 = " + (number1 / number2));
        System.out.println("Number1 ٪ Number2 = " + (number1 % number2));

        System.out.println("Increment by 1 => " + number1++);
        System.out.println("Increment by 1 => " + ++number1);

        System.out.println("Decrement by 1 => " + number1--);
        System.out.println("Decrement by 1 => " + --number1);
    }
}
