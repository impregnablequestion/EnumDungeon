package com.codeclan.characters.fighters;

import com.codeclan.behaviours.IAttack;
import com.codeclan.characters.enums.AttackItem;
import com.codeclan.characters.Character;
import com.codeclan.characters.enums.WeaponType;

public class Barbarian extends Character implements IAttack {

    private WeaponType weapon;
    public Barbarian(String name, int health) {
        super(name, health);
        this.weapon = WeaponType.CLUB;
    }

    @Override
    public void attack(AttackItem attackItem, Character character) {
        character.receiveDamage(weapon.getDamage());
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
