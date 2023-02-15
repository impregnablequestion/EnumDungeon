package com.codeclan.characters.enemies;

import com.codeclan.characters.Character;

public abstract class Enemy extends Character {

    public Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public boolean receiveHealing(int healing){
        return false;
    }



}
