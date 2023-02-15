package com.codeclan.characters.magicians;

import com.codeclan.behaviours.IAttack;
import com.codeclan.characters.enums.AttackItem;
import com.codeclan.characters.Character;
import com.codeclan.characters.enums.CreatureType;
import com.codeclan.characters.enums.SpellType;

import java.util.ArrayList;

public class Wizard extends Character implements IAttack {

    private ArrayList<SpellType> spells;
    private SpellType selectedSpell;
    private CreatureType creature;

    public Wizard(String name, int health) {

        super(name, health);
        this.spells = new ArrayList<>();
        spells.add(SpellType.FIREBALL);
        this.selectedSpell = spells.get(0);
        this.creature = CreatureType.OGRE;
    }

    public void setCreature(CreatureType creature) {
        this.creature = creature;
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
    @Override
    public void receiveDamage(int damage){
        int newDamage = (int)Math.round(damage/creature.getDefenceModifier());
        this.health -= (newDamage);
    }
}
