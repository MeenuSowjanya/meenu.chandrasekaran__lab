package com.Sowjanya;

import java.util.Scanner;

public class W3Resource {

    public static void main(String[] args){
        print();
    }
    public static void print(){
        // Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.print("Meenu Sowjanya");

        // Write a Java program to print the sum of two numbers.
        System.out.println(15+16);

        // Write a Java program to divide two numbers and print on the screen.
        System.out.println(15/3);

        /*
         Write a Java program to print the result of the following operations.
         Test Data:
               a. -5 + 8 * 6
               b. (55+9) % 9
               c. 20 + -3*5 / 8
               d. 5 + 15 / 3 * 2 - 8 % 3
         */
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        // Write a Java program that takes two numbers as input and display the product of two numbers.
        Scanner input=new Scanner(System.in);
        System.out.print("Input 1 : ");
        int num1= input.nextInt();
        System.out.print("Input 2 : ");
        int num2= input.nextInt();
        System.out.println("Added Results = "+(num1+num2));

        // Write a Java program that takes a number as input and prints its multiplication table upto 10.
        System.out.println("Enter the number : ");
        int number= input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }

        /*

        Write a Java program to display the following pattern. Go to the editor
        Sample Pattern :

        J    a   v     v  a
        J   a a   v   v  a a
     J  J  aaaaa   V V  aaaaa
      JJ  a     a   V  a     a

         */
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");

        // Write a Java program to compute the specified expressions and print the output.
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

        // Write a Java program to compute a specified formula.
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

        // Write a Java program to print the area and perimeter of a circle.
        int radius=12;
        System.out.println("Perimeter is = " + 2 * Math.PI * radius);
        System.out.println("Area is = " + Math.PI * radius * radius );

        // Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        System.out.print("Input first number: ");
        int number1 = input.nextInt();

        System.out.print("Input second number: ");
        int number2 = input.nextInt();

        System.out.print("Input third number: ");
        int number3 = input.nextInt();

        System.out.print("Input fourth number: ");
        int number4 = input.nextInt();

        System.out.print("Enter fifth number: ");
        int number5 = input.nextInt();


        System.out.println("Average of five numbers is: " +
                (number1 + number2 + number3 + number4 + number5) / 5);
    }


}
