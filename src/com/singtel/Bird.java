package com.singtel;

class Bird extends Animal implements Walkable {
    void sing() {
        System.out.println("Bird is singing");
    }
    public void walk() {
        System.out.println("Bird is walking");
    }
}
