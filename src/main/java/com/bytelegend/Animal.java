package com.bytelegend;

public class Animal extends Life {
    private final String sound;

    public Animal(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    public void animalSound() {
        System.out.println(sound);
    }
}
