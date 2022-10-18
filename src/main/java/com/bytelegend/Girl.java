package com.bytelegend;

public class Girl extends Person{
//    private final String name;
//    private final int age;

    public Girl(String name, int age) {
//        this.name = name;
//        this.age = age;
        super(name, age);
    }

//    public void sayMyName() {
//        System.out.println("my name is: " + name);
//    }
//
//    public void sayMyAge() {
//        System.out.println("my age is: " + age);
//    }

    public void sayGirl() {
        System.out.println("I'm a girl");
        sayMyName();
        sayMyAge();
    }
}
