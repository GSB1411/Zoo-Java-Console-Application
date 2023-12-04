package com.ing.zoo;

public class Elephant extends Herbivore {
    public String name;
    public String helloText;
    public String eatText;

    public Elephant(){

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
