package com.codeclan.behaviours;

import com.codeclan.characters.enums.AttackItem;
import com.codeclan.characters.Character;

public interface IAttack {

    void attack(AttackItem attackItem, Character character);

    AttackItem getAttackItem();

    void changeAttackItem(AttackItem attackItem);

}
