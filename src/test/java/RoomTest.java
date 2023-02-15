import com.codeclan.Party;
import com.codeclan.Room;
import com.codeclan.TreasureType;
import com.codeclan.characters.enemies.Enemy;
import com.codeclan.characters.enemies.Orc;
import com.codeclan.characters.fighters.Dwarf;
import com.codeclan.characters.fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class RoomTest {

    Party party;
    Room room;
    ArrayList<Enemy> enemies;
    Orc orc;
    Dwarf dwarf;
    Knight knight;



    @Before
    public void setUp(){
        enemies = new ArrayList<>();
        dwarf = new Dwarf("Josh", 200);
        knight = new Knight("Arthur", 190);
        party = new Party();
        party.addCharacter(knight);
        party.addCharacter(dwarf);
        orc = new Orc("Kyle", 50);
        enemies.add(orc);
        room = new Room(party, enemies, TreasureType.SILVER);
    }

    @Test
    public void cantCompleteRoomWhenOrcIsStillAlive(){
        assertFalse(party.completeRoom(room));
    }

    @Test
    public void canCompleteRoomOnceOrcsAreDead(){
        dwarf.attack(dwarf.getAttackItem(), orc);
        dwarf.attack(dwarf.getAttackItem(), orc);
        dwarf.attack(dwarf.getAttackItem(), orc);
        assertTrue(party.completeRoom(room));

    }
}
