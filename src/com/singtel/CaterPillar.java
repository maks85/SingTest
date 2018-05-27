package com.singtel;


class CaterPillar extends Animal implements Walkable {
    public void walk() {
        System.out.println("Caterpillar is crawling");
    }

    public Butterfly grow() {
        return new Butterfly();
    }
}