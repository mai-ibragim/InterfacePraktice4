package com.company;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.drink();
        dog.eat();

        Cat cat = new Cat();
        cat.drink();
        cat.eat();

       Bird bird = new Bird();
       bird.fly();

       Crow crow = new Crow();
       crow.fly();
    }
}
