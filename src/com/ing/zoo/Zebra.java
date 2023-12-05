package com.ing.zoo;

import com.ing.zoo.Animal;
import com.ing.zoo.Herbivore;
import com.ing.zoo.PerformTrick;

import java.util.Random;

public class Zebra extends Animal implements Herbivore, PerformTrick {

    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name)
    {
        super(name);

    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }


    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "plays dead";
        }
        else
        {
            trick = "charges like horse";
        }
        System.out.println(trick);
    }
}
