package com.bytelegend;

public class Dog extends Animal{
//    private final String name;

    public Dog(String name) {
//        this.name = name;
        super(name);
    }

//    public void sayMyName() {
//        System.out.println("my name is: " + name);
//    }

    public void animalSound() {
        System.out.println("woof");
    }
}
