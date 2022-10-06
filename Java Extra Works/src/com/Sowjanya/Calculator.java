package com.Sowjanya;

import java.lang.*;

public class Calculator{
    double number1,number2;
    Calculator(double n1,double n2){
        number1=n1;
        number2=n2;
    }
    public static void main(String[] args){

        Calculator inputs=new Calculator(5,12);
        System.out.println(add(inputs.number1,inputs.number2));
        System.out.println(subtract(inputs.number1,inputs.number2));
        System.out.println(multiply(inputs.number1,inputs.number2));
        System.out.println(divide(inputs.number1,inputs.number2));
        System.out.println(exponent(inputs.number1,inputs.number2));
        System.out.println(log(inputs.number1,inputs.number2));
        System.out.println(sin(inputs.number1));
        System.out.println(cos(inputs.number1));
        System.out.println(tan(inputs.number2));
        System.out.println(inputs.number2);

        // (OR  - Without Constructors usage)

        System.out.println(add(5,4));
        System.out.println(subtract(5,4));
        System.out.println(multiply(inputs.number1,inputs.number2));
        System.out.println(divide(inputs.number1,inputs.number2));
        System.out.println(exponent(inputs.number1,inputs.number2));
        System.out.println(log(inputs.number1,inputs.number2));
        System.out.println(sin(inputs.number1));
        System.out.println(cos(inputs.number1));
        System.out.println(tan(inputs.number2));
        System.out.println(inputs.number2);

    }
    public static double add(double n1,double n2){
        return (n1+n2);
    }
    public static double subtract(double n1,double n2){
        return (n1-n2);
    }
    public static double multiply(double n1,double n2){
        return (n1*n2);
    }
    public static double divide(double n1,double n2){
        return (n1/n2);
    }
    public static double exponent(double n1,double power){
        return (Math.pow(n1,power));
    }
    public static double sin(double n1){
        return (Math.sin(n1));
    }
    public static double cos(double n1){
        return (Math.cos(n1));
    }
    public static double tan(double n1){
        return (Math.tan(n1));
    }
    public static double log(double n1,double base){
        return ((Math.log(n1))/Math.log(base));
    }

}
