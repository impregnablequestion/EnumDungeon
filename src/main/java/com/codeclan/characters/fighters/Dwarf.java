package com.codeclan.characters.fighters;

import com.codeclan.behaviours.IAttack;
import com.codeclan.characters.enums.AttackItem;
import com.codeclan.characters.Character;
import com.codeclan.characters.enums.WeaponType;

public class Dwarf extends Character implements IAttack {

    private WeaponType weapon;

    public Dwarf(String name, int health) {
        super(name, health);
        this.weapon = WeaponType.AXE;
    }


    @Override
    public void attack(AttackItem attackItem, Character character) {
        character.receiveDamage(attackItem.getDamage());
    }

    public AttackItem getAttackItem() {
        return weapon;
    }

    @Override
    public void changeAttackItem(AttackItem attackItem) {
        weapon = (WeaponType) attackItem;
    }


}
