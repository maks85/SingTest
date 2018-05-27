package com.singtel;

class Dog extends Animal implements Talkable {
    public void talk() {
        System.out.println("Woof, woof");
    }
}
