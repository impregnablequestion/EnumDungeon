import com.codeclan.characters.fighters.Barbarian;
import com.codeclan.characters.fighters.Dwarf;
import com.codeclan.characters.fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Barbarian barbarian;
    Dwarf dwarf;
    Knight knight;

    @Before
    public void setUp(){
        barbarian = new Barbarian("Konan", 100);
        dwarf = new Dwarf("Gimli", 90);
        knight = new Knight("Arthur", 80);
    }

    @Test
    public void canAttack(){
        barbarian.attack(barbarian.getAttackItem(), dwarf);
        dwarf.attack(dwarf.getAttackItem(), knight);
        knight.attack(knight.getAttackItem(), barbarian);
        assertEquals(65, dwarf.getHealth());
        assertEquals(60, knight.getHealth());
        assertEquals(85, barbarian.getHealth());
    }
    @Test
    public void canKill () {
        barbarian.attack(barbarian.getAttackItem(), knight);
        barbarian.attack(barbarian.getAttackItem(), knight);
        barbarian.attack(barbarian.getAttackItem(), knight);
        barbarian.attack(barbarian.getAttackItem(), knight);
        assertEquals(false, knight.getAlive());
    }
}
