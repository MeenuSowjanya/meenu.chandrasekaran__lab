package com.COC;

import java.util.Scanner;

public class Math {

    public static void main(String[] args){

        // Math Class

        byte no=12;
        float ft1=12.872f;
        System.out.println(Math.abs(ft1));
        System.out.println(Math.ceil(ft1));
        System.out.println(Math.floor(ft1));
        System.out.println(Math.max(no,ft1));
        System.out.println(Math.exp(12));
        System.out.println(Math.log(12));

        // Runtime input - Scanner class import - Reference

        Scanner input=new Scanner(System.in);    // Only one time scanner new creation is enough to get multiple inputs
        System.out.println("Enter your name :   ");
        String name = input.nextLine();
        System.out.println("Welcome "+name);
        System.out.println("Enter your age :  ");
        byte age= input.nextByte();
        System.out.println("Your age is : "+age+".");

        // One word use - next ; a sentence - nextLine ; integer - nextInt ; byte - nextByte and so on ....
    }

}
