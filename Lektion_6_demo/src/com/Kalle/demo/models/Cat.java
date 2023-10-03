package com.Kalle.demo.models;

public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("Walk");

    }

    @Override
    public void eat() {
        System.out.println("Catfood");

    }

    @Override
    public void sleep() {
        System.out.println("Yes");

    }

    @Override
    public void makeSound() {
        System.out.println("Meow");

    }
}
