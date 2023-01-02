package com.bytelegend;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("meow");
    }
}