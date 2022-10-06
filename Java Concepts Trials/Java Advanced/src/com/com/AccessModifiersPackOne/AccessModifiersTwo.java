package com.com.AccessModifiersPackOne;

public class AccessModifiersTwo {
    AccessModifiersOne object = new AccessModifiersOne();

    public static void main(String[] args) {
        AccessModifiersOne object = new AccessModifiersOne();
        // System.out.println(object.numberOne);    Private variable - Unable to access
        System.out.println(object.numberTwo);
        System.out.println(object.numberThree);
        System.out.println(object.numberFour);
    }
}
