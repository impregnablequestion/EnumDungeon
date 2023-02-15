package com.codeclan.characters.enemies;


public class Orc extends Enemy {

    public Orc(String name, int health) {
        super(name, health);
    }

    public String scream() {
        return "AAAAAAA!!!!!!!";
    }

}
