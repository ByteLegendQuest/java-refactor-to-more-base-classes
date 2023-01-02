package com.bytelegend;

public class Animal extends Life {
    protected String sound;

    Animal(String name) {
        super(name);
    }

    public void animalSound() {
        System.out.println(this.sound);
    }
}
