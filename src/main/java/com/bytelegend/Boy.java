package com.bytelegend;

public class Boy {
    private final String name;
    private final int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMyName() {
        System.out.println("my name is: " + name);
    }

    public void sayMyAge() {
        System.out.println("my age is: " + age);
    }

    public void sayBoy() {
        System.out.println("I'm a boy");
        sayMyName();
        sayMyAge();
    }
}
