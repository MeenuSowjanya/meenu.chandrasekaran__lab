package com.COC;

import java.util.Scanner;

public class Conditions{

  public static void main(String[] args){

    // Conditional Statements

    // Same as js

    if(12<18){
      System.out.println("You are not eligible to vote.");
    }
    else if(12==18){
      System.out.println("You are voting for the first time.");
    }
    else{
      System.out.println("You are eligible for voting");
    }

    // Switch case

    Scanner input=new Scanner(System.in);
    System.out.println("Enter your favourite Color :  ");
    String favColor=input.next();

    switch (favColor){
      case "Blue" :
        System.out.println("I love Blue.");
        break;

      case "Green" :
        System.out.println("Green is my fav too !");
        break;

      default:
        System.out.println("You do not have good taste");
    }

  }

}

