package com.ing.zoo;

import com.ing.zoo.Animal;
import com.ing.zoo.Carnivore;
import com.ing.zoo.PerformTrick;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, PerformTrick {

    public String helloText;
    public String eatText;
    public String trick;

    public Tiger(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
