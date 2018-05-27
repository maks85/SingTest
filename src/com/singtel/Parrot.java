package com.singtel;

class Parrot extends Bird implements Singable {
    Talkable neighbor;

    public Parrot(Talkable t) {
        neighbor = t;
    }

    public void talk() {
        if (null != neighbor) neighbor.talk();
    }

    public void sing() {
        System.out.println("Parrot is singing!");
    }
}

