package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";


        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Elephant tom = new Elephant("tom");
        Hyena jerry = new Hyena("jerry");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();


        //Created Array containing all animals
        Animal[] animals = {henk, elsa, dora, wally, marty, tom, jerry};


        for (Animal animal : animals) {
            if (input.equals("hello " + animal.getName())) {
                animal.sayHello();

            } else if (input.equals(commands[0])) {
               animal.sayHello();

            } else if (input.equals(commands[1])) {
                if (animal instanceof Herbivore) {
                    animal.eatLeaves();
                }

            } else if (input.equals(commands[2])){
                if (animal instanceof Carnivore){
                    animal.eatMeat();
                }
            } else if (input.equals(commands[3])){
                if (animal instanceof PerformTrick){
                    animal.performTrick();
                }
            }

        }
    }}
