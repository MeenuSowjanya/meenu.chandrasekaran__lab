package com.COC;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args){
        // Question 1 : F to C
        Scanner input=new Scanner(System.in);
//        double farenheit= input.nextDouble();
//        double celsius=((farenheit-32))*(5/9f);
//        System.out.println("Your given temperature in Farenheit = "+celsius);

        // Question 2 : Adds all integers
        int number= input.nextInt();
        int mediator=0;
        while(number>0){
            mediator+=number%10;
            number/=10;
        }
        System.out.println(mediator);



    }
}
