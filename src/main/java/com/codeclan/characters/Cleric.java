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
        setSelectedMedicine(medicine);
    }

    public void setSelectedMedicine(MedicineType selectedMedicine) {
        this.selectedMedicine = selectedMedicine;
    }

    public boolean changeSelectedMedicine(MedicineType medicine) {
        if (medicines.contains(medicine)) {
            setSelectedMedicine(medicine);
            return true;
        } else {
            return false;
        }
    }

    public MedicineType getSelectedMedicine() {
        return selectedMedicine;
    }

    private void removeMedicine(MedicineType medicine){
        medicines.remove(medicine);
    }

    public boolean heal(MedicineType medicine, Character character){
        if (selectedMedicine == null) {
            return false;
        } else {
            if (character.receiveHealing(medicine.getHealing())) {
                medicines.remove(medicine);
                return true;
            } else {
                return false;
            }
        }
    }

    public ArrayList<MedicineType> getMedicines() {
        return medicines;
    }
}
