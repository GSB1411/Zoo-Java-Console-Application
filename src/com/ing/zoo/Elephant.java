package com.ing.zoo;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivore;

public class Elephant extends Animal implements Herbivore {

    public String helloText;
    public String eatText;

    public Elephant(String name){

        super(name);
    }

    public void sayHello(){
        helloText = "elephant elephant";
        System.out.println(helloText);
    }

    public void eatLeaves(){
        eatText = "chomp chomp nice";
        System.out.println(eatText);
    }
}
