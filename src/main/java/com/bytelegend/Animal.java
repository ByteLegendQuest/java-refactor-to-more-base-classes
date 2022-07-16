package com.bytelegend;

public abstract class Animal extends Life {
    protected String sound;

    public void animalSound() {
        System.out.println(sound);
    };
}
