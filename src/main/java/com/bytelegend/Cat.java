package com.bytelegend;

public class Cat extends Animal{
//    private final String name;

    public Cat(String name) {
//        this.name = name;
        super(name);
    }

//    public void sayMyName() {
//        System.out.println("my name is: " + name);
//    }

    public void animalSound() {
        System.out.println("meow");
    }
}
