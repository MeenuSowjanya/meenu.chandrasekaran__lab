package com.com.AccessModifiersPackOne;

public class AccessModifiersOne {
    private int numberOne=1;
    public int numberTwo=2;
    protected int numberThree=3;
    int numberFour=4;

    public static void main(String[] args) {
        AccessModifiersOne object = new AccessModifiersOne();
        System.out.println(object.numberOne);
        System.out.println(object.numberTwo);
        System.out.println(object.numberThree);
        System.out.println(object.numberFour);
    }
}
