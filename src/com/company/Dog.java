package com.company;

public class Dog extends Animal{


    @Override
    public void eat() {
        System.out.println("The dog eats a bone");

    }

    @Override
    public void drink() {
        System.out.println("The dog drinks water");
    }
}
