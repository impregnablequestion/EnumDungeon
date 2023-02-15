package com.codeclan;

public enum TreasureType {
    GEMS(50),
    SILVER(75),
    RUBY(90),
    GOLD(100);

    private int value;

    TreasureType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
