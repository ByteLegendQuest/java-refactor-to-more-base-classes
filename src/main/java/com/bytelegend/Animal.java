package com.bytelegend;

public class Animal extends Life {

    private final String animalSound;

    public Animal(String name,String animalSound) {
        super(name);
        this.animalSound = animalSound;
    }

    public void animalSound() {
        System.out.println(animalSound);
    }
}
