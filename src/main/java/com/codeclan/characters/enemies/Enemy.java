package com.codeclan.characters.enemies;

import com.codeclan.behaviours.IAttack;
import com.codeclan.characters.Character;
import com.codeclan.characters.enums.AttackItem;
import com.codeclan.characters.enums.WeaponType;

public abstract class Enemy extends Character implements IAttack {

    protected WeaponType weapon;

    public Enemy(String name, int health) {
        super(name, health);
        this.weapon = WeaponType.SWORD;
    }

    @Override
    public boolean receiveHealing(int healing){
        return false;
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
