package com.bytelegend;

public class Animal extends Life{

    public Animal(String name) {
        super(name);
    }

    public void animalSound() {
        System.out.println("woof");
        System.out.println("meow");
    }

}
