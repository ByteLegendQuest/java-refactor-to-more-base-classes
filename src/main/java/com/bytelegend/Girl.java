package com.bytelegend;

public class Girl extends Person {

    public Girl(String name, int age) {
        super(name, age);
    }

    public void sayGirl() {
        System.out.println("I'm a girl");
        sayMyName();
        sayMyAge();
    }
}
