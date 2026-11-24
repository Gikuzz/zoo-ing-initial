package com.ing.zoo;

import java.util.Random;

public class Eagle extends Animal implements Carnivore, Trick {
    private String trick;

    public Eagle()
    {
    }

    public void sayHello()
    {
        helloText = "kraa kraa";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "scheur scheur thx";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0)
        {
            trick = "flies high";
        }
        else
        {
            trick = "spreads its wings";
        }
        System.out.println(trick);
    }
}
