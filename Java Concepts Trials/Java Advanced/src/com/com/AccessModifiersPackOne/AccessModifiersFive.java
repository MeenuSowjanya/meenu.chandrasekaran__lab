package com.com.AccessModifiersPackOne;

public class AccessModifiersFive extends AccessModifiersOne{
    public static void main(String[] args) {
        AccessModifiersFive object = new AccessModifiersFive();
//        System.out.println(object.numberOne);   Private
        System.out.println(object.numberTwo);
        System.out.println(object.numberThree);
        System.out.println(object.numberFour);
    }
}
