package com.com.AccessModifiersPackTwo;

import com.com.AccessModifiersPackOne.AccessModifiersOne;

public class AccessModifiersThree {
    public static void main(String[] args) {
        AccessModifiersOne object = new AccessModifiersOne();
//        System.out.println(object.numberOne);    Private variable - Cannot be accessed
          System.out.println(object.numberTwo);
//        System.out.println(object.numberThree);  Protected variable - Cant be accesses in non - subclass
//        System.out.println(object.numberFour);   Default variable - Cant be accessed outside package
    }
}
