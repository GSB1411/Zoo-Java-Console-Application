package com.ing.zoo;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivore;

public class Hyena extends Animal implements Carnivore {

    public String helloText;
    public String eatText;

    public Hyena(String name) {
        super(name);
    }

    public void sayHello() {
        helloText = "Whine whine";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "whine nom whine nom";
        System.out.println(eatText);
    }


}
