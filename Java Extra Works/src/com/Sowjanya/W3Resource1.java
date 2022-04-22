package com.Sowjanya;

import java.util.Scanner;

public class W3Resource1<dec_num, quot> {
    public static void main(String[] args) {
        math();
    }

    public static void math() {
        //  Write a Java program to print the area and perimeter of a rectangle.
        double width = 5.6;
        double height = 8.5;

        double perimeter = 2 * (height + width);

        double area = width * height;
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

        // Write a Java program to print an American flag on the screen.
        System.out.println("\n");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

        // Write a Java program to swap two variables.
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + +b);

        /*

        Write a Java program to print a face.
        Expected Output

        +"""""+
       [| o o |]
        |  ^  |
        | '-' |
        +-----+

         */
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

        // Write a Java program to add two binary numbers.
        int binarye1 = 12, binarye2 = 15, i = 0, remainder = 0;
        int[] sum = new int[20];
        while (binarye1 != 0 || binarye2 != 0) {
            sum[i++] = (int) ((binarye1 % 10 + binarye2 % 10 + remainder) % 2);
            remainder = (int) ((binarye1 % 10 + binarye2 % 10 + remainder) / 2);
            binarye1 = binarye1 / 10;
            binarye2 = binarye2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

        // Write a Java program to multiply two binary numbers.
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        binary1 = input.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = input.nextLong();
        while (binary2 != 0) {
            digit = (int) (binary2 % 10);
            if (digit == 1) {
                binary1 = binary1 * factor;
                multiply = binaryproduct((int) binary1, (int) multiply);
            } else {
                binary1 = binary1 * factor;
            }
            binary2 = binary2 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply + "\n");
    }

    static int binaryproduct(int binary1, int binary2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
    }

   
}



