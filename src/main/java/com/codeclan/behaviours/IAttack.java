package com.codeclan.behaviours;

import com.codeclan.characters.AttackItem;
import com.codeclan.characters.Character;
import com.codeclan.characters.SpellType;
import com.codeclan.characters.WeaponType;

public interface IAttack {

    void attack(AttackItem attackItem, Character character);

    AttackItem getAttackItem();

    void changeAttackItem(AttackItem attackItem);

}
