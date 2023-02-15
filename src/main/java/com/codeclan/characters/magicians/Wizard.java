package com.codeclan.characters.magicians;

import com.codeclan.behaviours.IAttack;
import com.codeclan.characters.AttackItem;
import com.codeclan.characters.Character;
import com.codeclan.characters.SpellType;

import java.util.ArrayList;

public class Wizard extends Character implements IAttack {

    private ArrayList<SpellType> spells;
    private SpellType selectedSpell;

    public Wizard(String name, int health) {

        super(name, health);
        this.spells = new ArrayList<>();
        spells.add(SpellType.FIREBALL);
        this.selectedSpell = spells.get(0);
    }

    @Override
    public void attack(AttackItem attackItem, Character character) {
        character.receiveDamage(attackItem.getDamage());
    }

    @Override
    public AttackItem getAttackItem() {
        return selectedSpell;
    }
    @Override
    public void changeAttackItem(AttackItem attackItem) {
        SpellType spell = (SpellType) attackItem;
        if (spells.contains(spell)) {
            selectedSpell = spell;
        }
    }
    public void addSpell(SpellType spellType) {
        spells.add(spellType);
    }
}
