import com.codeclan.characters.Cleric;
import com.codeclan.characters.enums.MedicineType;
import com.codeclan.characters.fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;
    Dwarf dwarf;
    @Before
    public void setup () {
        dwarf = new Dwarf("Gimli", 200);
        cleric = new Cleric("Delph", 200);
        cleric.addMedicine(MedicineType.HERB);
    }
    @Test
    public void canHealDamage () {
        dwarf.attack(dwarf.getAttackItem(), dwarf);
        cleric.heal(cleric.getSelectedMedicine(), dwarf);
        assertEquals(195, dwarf.getHealth());
        assertEquals(0, cleric.getMedicines().size());
    }
    @Test
    public void willOnlyHealUpToMaxHealth () {
        cleric.heal(cleric.getSelectedMedicine(), dwarf);
        assertEquals(200, dwarf.getHealth());
        assertEquals(1, cleric.getMedicines().size());
    }
}
