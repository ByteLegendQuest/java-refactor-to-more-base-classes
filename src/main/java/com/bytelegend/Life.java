package com.bytelegend;

public class Life {
    protected final String name;

    public Life(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("my name is: " + name);
    }
}
