import com.codeclan.characters.magicians.Warlock;
import com.codeclan.characters.magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagiciansTest {
    Warlock warlock;
    Wizard wizard;

    @Before
    public void setUp () {
        warlock = new Warlock("Kyle", 100);
        wizard = new Wizard("Kelsie", 120);
    }
    @Test
    public void canAttackWithSpell () {
        warlock.attack(warlock.getAttackItem(), wizard);
        wizard.attack(wizard.getAttackItem(), warlock);

        assertEquals(80, warlock.getHealth());
        assertEquals(80, wizard.getHealth());
    }

}
