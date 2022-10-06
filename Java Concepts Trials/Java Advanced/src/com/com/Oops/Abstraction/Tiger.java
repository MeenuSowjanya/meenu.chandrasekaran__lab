package com.com.Oops.Abstraction;

public class Tiger extends WildAnimals{

    @Override
    void eat() {
        System.out.println("Meat");
    }

    @Override
    void sleep() {
        System.out.println("5 hours");
    }

    public static void main(String[] args) {
        Tiger.output();
        Tiger object = new Tiger();
        object.eat();
        object.sleep();

    }
}
