package com.singtel;

/**
 * @author manish
 * ClownFish extending Fish 
 */
class ClownFish extends Fish {
    public ClownFish() {
        size = Size.SMALL;
        color = Color.ORANGE;
    }

    public void joke() {
        System.out.println("Clownfish makes jokes.");
    }
}