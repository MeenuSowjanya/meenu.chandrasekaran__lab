package com.com.Oops.Inheritance;

class MLInheritanceOne {
        String name = "Meenu";
public void methodOne(){
        System.out.println("Hello");
        }
public static void methodTwo(){
        System.out.println("HelloWorld");
        }
        }

class MLInheritanceTwo extends MLInheritanceOne{
    protected static void methodThree(){
        System.out.println("Meenu");
    }
    void methodFour(){
        System.out.println("Sowjanya");
    }
}

class MLInheritanceThree extends MLInheritanceTwo{
    static void methodFive(){
        System.out.println("Meenu Sowjanya");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        MLInheritanceThree object = new MLInheritanceThree();
        System.out.println(object.name);
        object.methodOne();
        MLInheritanceThree.methodTwo();
        MLInheritanceThree.methodThree();
        object.methodFour();
        object.methodFive();
    }

}
