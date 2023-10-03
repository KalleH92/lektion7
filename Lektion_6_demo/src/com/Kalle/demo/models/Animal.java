package com.Kalle.demo.models;

//Abstract - Inherence (arv)
//As a Standar, methods are PUBLIC
//Uses keyword: Implemetns

public interface Animal {
    //TODO Give relevant names
    //TODO Implement Inherretents
    //TODO SUPER VIKTIGT: private vis/mod


    //Abstract method
    void name();
    void move();
    void eat ();
    void sleep ();
    void makeSound();
    //Default?
    default void typeOfAnimal(String typeOfAnimal){
        System.out.println(typeOfAnimal);
    }

}

