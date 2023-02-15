package com.codeclan.characters.enums;

public enum MedicineType {
    POTION(20),
    HERB(15);

    private int healing;

    MedicineType(int healing) {
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }
}
