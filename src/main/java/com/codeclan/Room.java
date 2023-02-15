package com.codeclan;

import com.codeclan.characters.enemies.Enemy;

import java.util.ArrayList;

public class Room {

    private Party party;
    private ArrayList<Enemy> enemies;
    private TreasureType treasure;

    public Room(Party party, ArrayList<Enemy> enemies, TreasureType treasure) {
        this.party = party;
        this.enemies = enemies;
        this.treasure = treasure;
    }

    public ArrayList<Enemy> getAliveEnemies() {
        ArrayList<Enemy> aliveEnemies = new ArrayList<>();
        for (Enemy e : enemies) {
            if (e.getAlive()) {aliveEnemies.add(e);}
        }
        return aliveEnemies;
    }

    public TreasureType getTreasure() {
        if (getAliveEnemies().size() == 0) {
            return treasure;
        }
        return null;
    }
}
