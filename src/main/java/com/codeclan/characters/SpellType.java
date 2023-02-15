package com.codeclan.characters;

public enum SpellType implements AttackItem {
    FIREBALL(40),
    LIGHTNING_STRIKE(60);

    private int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
