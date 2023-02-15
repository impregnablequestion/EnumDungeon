package com.codeclan.characters.enums;

public enum CreatureType {

    OGRE(1.5),

    DRAGON(2);

    private double defenceModifier;

    CreatureType(double defenceModifier) {
        this.defenceModifier = defenceModifier;
    }

    public double getDefenceModifier() {
        return defenceModifier;
    }
}
