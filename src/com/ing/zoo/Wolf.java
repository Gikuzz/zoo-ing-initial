package com.ing.zoo;

import java.util.Random;

public class Wolf extends Animal implements Carnivore, Trick {
    private String trick;

    public Wolf()
    {
    }

    public void sayHello()
    {
        helloText = "wooooo";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom awooo";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0)
        {
            trick = "howls at the moon";
        }
        else
        {
            trick = "jumps over a log";
        }
        System.out.println(trick);
    }
}
