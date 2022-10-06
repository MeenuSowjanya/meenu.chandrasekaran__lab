package com.com.AccessModifiersPackTwo;

import com.JA.AccessModifiers;
import com.com.AccessModifiersPackOne.AccessModifiersOne;

public class AccessModifiersFour extends AccessModifiersOne{
    public static void main(String[] args) {
        AccessModifiersFour object = new AccessModifiersFour();
//        System.out.println(object.numberOne);   Private
        System.out.println(object.numberTwo);
        System.out.println(object.numberThree);
//        System.out.println(object.numberFour);  Default
    }
}
