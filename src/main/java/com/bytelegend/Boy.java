package com.bytelegend;

public class Boy extends Person {
    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayBoy() {
        System.out.println("I'm a boy");
        sayMyName();
        sayMyAge();
    }
}
