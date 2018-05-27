package com.singtel;

class Duck extends Bird implements Swimmable, Talkable, Flyable {
    public void fly() {
        System.out.println("I am flying");
    }
    public void swim() {
        System.out.println("I am swimming");
    }

    public void talk() {
        System.out.println("Quack, quack");
    }
}