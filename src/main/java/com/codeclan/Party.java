package com.codeclan;
import com.codeclan.characters.Character;

import java.util.ArrayList;

public class Party {

    private ArrayList<Character> characters;
    private ArrayList<TreasureType> treasures;

    public Party() {
        this.characters = new ArrayList<>();
        this.treasures = new ArrayList<>();
    }

    public void addCharacter (Character character) {
        characters.add(character);
    }

    public void addTreasure (TreasureType treasure) {
        treasures.add(treasure);
    }

    public boolean completeRoom(Room room) {
        TreasureType treasure = room.getTreasure();
        if (treasure != null) {
            treasures.add(treasure);
            return true;
        } else {
            return false;
        }
    }
}
