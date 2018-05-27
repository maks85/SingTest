/**
 * @author manish
 */
package com.singtel;

enum Size {
    LARGE,
    SMALL
}

enum Color {
    GREY,
    ORANGE
}


public class Solution {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{ new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dog()),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        int flyables = 0, walkables = 0, singables = 0, swimmables= 0;
        for (Animal a : animals) {
            if (a instanceof Flyable) flyables++;
            if (a instanceof Walkable) walkables++;
            if (a instanceof Singable) singables++;
            if (a instanceof Swimmable) swimmables++;
        }

        System.out.println(String.format("Total of %d animals, " +
                " %d can walk, %d can fly, %d can swim, %d can sing", animals.length,
                walkables, flyables, swimmables, singables));
    }
}