package com.codeclan.characters.enemies;
import com.codeclan.characters.Character;

public class Troll extends Enemy{

    public Troll(String name, int health) {
        super(name, health);
    }

    public String scream() {
        return "ARGGGG!!!!!!!";
    }
}
