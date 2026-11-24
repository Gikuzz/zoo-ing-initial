package com.ing.zoo;

public abstract class Animal {
    public String name;
    protected String helloText;
    protected String eatText;

    public abstract void sayHello();

    public String getName() {
        return name;
    }
}
