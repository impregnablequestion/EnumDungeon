package com.codeclan.characters;

import com.codeclan.characters.enums.MedicineType;

import java.util.ArrayList;

public class Cleric extends Character{

    private ArrayList<MedicineType> medicines;
    private MedicineType selectedMedicine;
    public Cleric(String name, int health) {
        super(name, health);
        this.medicines = new ArrayList<>();
        this.selectedMedicine = null;

    }

    public void addMedicine(MedicineType medicine){
        medicines.add(medicine);
    }

    public void setSelectedMedicine(MedicineType selectedMedicine) {
        this.selectedMedicine = selectedMedicine;
    }

    private void removeMedicine(MedicineType medicine){
        medicines.remove(medicine);
    }

    public void heal(Character character, MedicineType medicine){
        character.receiveHealing(medicine.getHealing());
    }
}
