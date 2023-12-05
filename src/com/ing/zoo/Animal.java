package com.ing.zoo;

public abstract class Animal {
    public String name;
    String eatText;

    public Animal(String name) {
        this.name = name;
    }

    public void sayHello(){

    }


    void eatLeaves(){

    }

    void eatMeat(){

    }

    void performTrick(){

    }

    public String getName() {
        return name;
    }
}
