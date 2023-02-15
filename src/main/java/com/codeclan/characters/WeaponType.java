package com.codeclan.characters;

public enum WeaponType implements AttackItem {

    SWORD(15),
    AXE(20),
    CLUB(25);

    private int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
