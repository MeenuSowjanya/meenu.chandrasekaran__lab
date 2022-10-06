package com.com.Oops.Inheritance.MultipleInheritanceAndHybridInheritance;

public class Meenu implements Human{
    @Override
    public void eat() {
        System.out.println("Vegetarian foods");
    }

    @Override
    public void sleep() {
        System.out.println("7 hours");
    }

    @Override
    public void walk() {
        System.out.println("10000 steps a day");
    }

    public static void main(String[] args) {
        Meenu human = new Meenu();
        human.eat();
        human.sleep();
        human.walk();
    }
}
