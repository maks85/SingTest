package com.singtel;

class Shark extends Fish {
    public Shark() {
        size = Size.LARGE;
        color = Color.GREY;
    }

    public void eat(Fish f) {
        System.out.println("Yum!");
    }
}

