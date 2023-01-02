package com.bytelegend;

public class Life {
    protected String name;

    Life(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("my name is: " + name);
    }

}
