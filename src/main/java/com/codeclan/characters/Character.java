package com.codeclan.characters;

public abstract class Character {

    private String name;

    protected int health;



    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public void receiveDamage(int damage){
        this.health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void receiveHealing(int healing){
        this.health += healing;
    }
}
