package com.bytelegend;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("woof");
    }
}
