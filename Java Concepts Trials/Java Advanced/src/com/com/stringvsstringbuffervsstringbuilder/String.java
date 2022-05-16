package com.com.stringvsstringbuffervsstringbuilder;

import java.lang.*;

public class String {
    public static void main(String[] args) {
        String name="Meenu";
        System.out.println(name.charAt(2));
        System.out.println(name.codePointAt(2));
        System.out.println(name.codePointBefore(3));
        System.out.println(name.codePointCount(1,4));
        System.out.println(name.compareTo("Sowjanya"));
        System.out.println(name.compareToIgnoreCase("Sowjanya"));
        System.out.println(name.concat("Sowjanya"));
        System.out.println(name.contains('p'));

    }
}