package com.codeclan.characters;

public abstract class Character {

    private String name;

    protected int health;
    private final int maxHealth;
    private boolean alive;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.alive = true;
    }
    public void receiveDamage(int damage){
        this.health -= damage;
        if (health <= 0) {
            this.alive = false;
        }
    }

    public int getHealth() {
        return health;
    }

    public boolean receiveHealing(int healing){
        if (health == maxHealth) {
            return false;
        }
        else if ((health + healing) >= maxHealth) {
            health = maxHealth;
        } else {
            this.health += healing;
        }
        return true;
    }

    public boolean getAlive () {
        return alive;
    }
}
