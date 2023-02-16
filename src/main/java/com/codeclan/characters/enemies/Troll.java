package com.codeclan.characters.enemies;
import com.codeclan.characters.Character;
import com.codeclan.characters.enums.WeaponType;

public class Troll extends Enemy{

    public Troll(String name, int health) {
        super(name, health);
        this.weapon = WeaponType.AXE;
    }

    public String scream() {
        return "ARGGGG!!!!!!!";
    }
}
