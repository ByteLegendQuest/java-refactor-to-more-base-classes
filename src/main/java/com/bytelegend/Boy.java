package com.bytelegend;

public class Boy extends Person {
    public Boy(String name, int age) {
        super(name, age);
    }

    public void sayBoy() {
        System.out.println("I'm a boy");
        sayMyName();
        sayMyAge();
    }
}
