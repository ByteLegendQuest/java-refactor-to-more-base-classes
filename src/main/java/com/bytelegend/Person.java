package com.bytelegend;

public class Person extends Life {
    protected final int age;

    public Person(String name, int age) {
        super(name);
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("my age is: " + age);
    }
}
