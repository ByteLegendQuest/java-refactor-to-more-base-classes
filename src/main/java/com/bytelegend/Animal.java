package com.bytelegend;

public class Animal extends Life {

    private final String shout;

    public Animal(String name, String shout) {
        super(name);
        this.shout = shout;
    }

    public void animalSound() {
        System.out.println(shout);
    }

}
