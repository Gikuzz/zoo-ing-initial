package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Eagle eagle = new Eagle();
        eagle.name = "eagle";
        Wolf wolf = new Wolf();
        wolf.name = "wolf";

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        animals.add(eagle);
        animals.add(wolf);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running)
        {
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine().trim();

            if (input.equals("hello"))
            {
                for (Animal animal : animals)
                {
                    animal.sayHello();
                }
            }
            else if (input.startsWith("hello "))
            {
                String name = input.substring("hello ".length()).trim();
                Animal requestedAnimal = findAnimal(animals, name);

                if (requestedAnimal != null)
                {
                    requestedAnimal.sayHello();
                }
                else
                {
                    System.out.println("Unknown animal: " + name);
                }
            }
            else if (input.equals("give leaves"))
            {
                for (Animal animal : animals)
                {
                    if (animal instanceof Herbivore)
                    {
                        ((Herbivore) animal).eatLeaves();
                    }
                }
            }
            else if (input.equals("give meat"))
            {
                for (Animal animal : animals)
                {
                    if (animal instanceof Carnivore)
                    {
                        ((Carnivore) animal).eatMeat();
                    }
                }
            }
            else if (input.equals("perform trick"))
            {
                for (Animal animal : animals)
                {
                    if (animal instanceof Trick)
                    {
                        ((Trick) animal).performTrick();
                    }
                }
            }
            else if (input.equals("exit"))
            {
                running = false;
            }
            else
            {
                System.out.println("Unknown command: " + input);
            }
        }

        scanner.close();
    }

    private static Animal findAnimal(List<Animal> animals, String name)
    {
        for (Animal animal : animals)
        {
            if (name.equalsIgnoreCase(animal.getName()))
            {
                return animal;
            }
        }

        return null;
    }
}
