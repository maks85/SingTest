package com.singtel;

class Fish extends Animal implements Swimmable {
    protected Size size;
    protected Color color;
    public void swim() {
        System.out.println("Fish is swimming!");
    }
}