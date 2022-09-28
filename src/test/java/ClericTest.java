import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Potion potion;
    private Spell weapon;
    private Wizzard wizzard;
    private Cleric cleric;

    @Before
    public void before(){
        potion = new Potion(20);
        weapon = new Spell(-10);
        wizzard = new Wizzard(120);
        cleric = new Cleric(100, potion);
    }

    @Test
    public void clericHealWizzard(){
     cleric.heal(wizzard);
     assertEquals(140, wizzard.getHealth());
    }

    @Test
    public void canHarmWizzard(){
        weapon.effectPlayer(wizzard);
        assertEquals(110, wizzard.getHealth());
    }

    @Test
    public void canHealWizzard(){
        potion.effectPlayer(wizzard);
        assertEquals(140, wizzard.getHealth());
    }



}
