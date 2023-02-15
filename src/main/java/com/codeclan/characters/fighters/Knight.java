package com.codeclan.characters.fighters;

import com.codeclan.behaviours.IAttack;
import com.codeclan.characters.AttackItem;
import com.codeclan.characters.Character;
import com.codeclan.characters.WeaponType;

public class Knight extends Character implements IAttack {
    private WeaponType weapon;
    public Knight(String name, int health) {
        super(name, health);
        this.weapon = WeaponType.SWORD;
    }

    @Override
    public void attack(AttackItem attackItem, Character character) {
        character.receiveDamage(attackItem.getDamage());
    }

    @Override
    public AttackItem getAttackItem() {
        return weapon;
    }

    @Override
    public void changeAttackItem(AttackItem attackItem) {
        weapon = (WeaponType) attackItem;
    }


}
