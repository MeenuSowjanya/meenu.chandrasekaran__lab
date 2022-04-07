package com.JA;

import java.util.Scanner;

public class A2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number= input.nextInt();
        String nIS=String.valueOf(number);
        int temp=0;
        for(int i=0;i<nIS.length();i++){
            temp+=Integer.parseInt(String.valueOf(nIS.charAt(i)));     // Use String.value()
        }
        System.out.println("Your desired result is : "+temp);

    }
}
