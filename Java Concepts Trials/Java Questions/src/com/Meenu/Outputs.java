package com.Meenu;

import java.util.*;
import java.lang.Math;

public class Outputs {

    public static void main(String[] args) { 
    	
       
       Scanner input=new Scanner(System.in);
       
       // Factorial
       System.out.print("Enter the number : ");
       int number=Mathematics.factorial(input.nextInt());
       System.out.println("");
       System.out.println("The factorial of the given number is : "+number);
       
       // Average of n numbers
       System.out.println("Enter the total number of terms : ");
       double average=Mathematics.average(input.nextInt());       
       System.out.println("The average of the given numbers is : "+average);
       
       // Reverse of a number
       System.out.println("Enter the number : ");
       int reverse=Mathematics.reverse(input.nextInt());
       System.out.println("The reverse of the given number is : "+reverse);
       
       //Armstrong number
       System.out.println("Enter the number : ");
       System.out.println(Mathematics.armstrong(input.nextInt()));
       
       // Fibanocci
       Mathematics.fib(input.nextInt());
       
       // Prime or not
       System.out.println("Enter the number : ");
       Mathematics.prime(input.nextInt());
       
       // Perfect or not
       System.out.println("Enter the number : ");
       Mathematics.perfect(input.nextInt());
       
       // Strong or not
       System.out.println("Enter the number : ");
       Mathematics.strong(input.nextInt());
    }
   
}
