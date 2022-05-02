package com.com.Oops.Inheritance;

class SLInheritanceOne {
    String name = "Meenu";
    public void methodOne(){
        System.out.println("Hello");
    }
    public static void methodTwo(){
        System.out.println("HelloWorld");
    }
}

class SLInheritanceTwo extends SLInheritanceOne{
    protected static void methodThree(){
        System.out.println("Meenu");
    }
    void methodFour(){
        System.out.println("Sowjanya");
    }
}

public class SingleLevelInheritance{
    public static void main(String[] args) {
        SLInheritanceTwo object = new SLInheritanceTwo();
        System.out.println(object.name);
        object.methodOne();
        SLInheritanceTwo.methodTwo();
        SLInheritanceTwo.methodThree();
        object.methodFour();
    }
}