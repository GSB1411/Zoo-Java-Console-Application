package com.ing.zoo;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivore;
import com.ing.zoo.Herbivore;
import com.ing.zoo.PerformTrick;

import java.util.Random;

public class Pig extends Animal implements Carnivore, Herbivore, PerformTrick {
    public String helloText;
    public String eatText;
    public String trick;

    public Pig(String name)
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
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
