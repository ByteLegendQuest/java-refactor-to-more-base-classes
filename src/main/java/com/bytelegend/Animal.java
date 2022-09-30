package com.bytelegend;

public class Animal extends Life {
    public Animal(String name) {
        super(name);
    }

    public void animalSound() {
        if (this instanceof Cat) {
            System.out.println("meow");
        } else if (this instanceof Dog) {
            System.out.println("woof");
        }
    }
}
