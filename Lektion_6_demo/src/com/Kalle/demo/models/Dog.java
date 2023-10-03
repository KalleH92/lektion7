package com.Kalle.demo.models;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("Runs franatically");

    }

    @Override
    public void eat() {
        System.out.println("Devours everything");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 50% of time");

    }

    @Override
    public void makeSound() {
        System.out.println("Voof woof, bark bark");

    }
}
