package com.ing.zoo;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivore;

public class Hippo extends Animal implements Herbivore {

    public String helloText;
    public String eatText;

    public Hippo(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
