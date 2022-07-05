package com.company;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("The cat eats a bread");
    }

    @Override
    public void drink() {
        System.out.println("The cat drinks milk");
    }
}
