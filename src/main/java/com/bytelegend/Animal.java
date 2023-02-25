package com.bytelegend;

public class Animal extends Life {

    String sound;
    public Animal(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    public void animalSound() {
        System.out.println(this.sound);
    }
}
