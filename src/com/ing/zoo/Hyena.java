package com.ing.zoo;

public class Hyena extends Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Hyena(){

    }

    public void sayHello(){
        helloText = "Whine whine";
        System.out.println(helloText);
    }

    public void eatMeat(){
        eatText = "whine nom whine nom";
        System.out.println(eatText);
    }


}
