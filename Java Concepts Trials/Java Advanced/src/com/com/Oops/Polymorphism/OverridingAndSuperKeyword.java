package com.com.Oops.Polymorphism;

public class OverridingAndSuperKeyword extends ParentClass{

    public static void output(){
        System.out.println("Hello Meenu");
    }

    public void main(String[] args) {
        output();
        super.output();
    }
}
