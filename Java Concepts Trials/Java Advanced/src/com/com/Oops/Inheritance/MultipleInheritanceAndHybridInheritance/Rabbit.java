package com.com.Oops.Inheritance.MultipleInheritanceAndHybridInheritance;

public class Rabbit implements Animal{
    @Override
    public void eat() {
        System.out.println("Grass and Vegetables");
    }

    @Override
    public void sleep() {
        System.out.println("5 hours");
    }

    public void run(){
        System.out.println("Runs fast");
    }

    public static void main(String[] args) {
        Rabbit object = new Rabbit();
        object.eat();
        object.run();
        object.sleep();
    }
}
