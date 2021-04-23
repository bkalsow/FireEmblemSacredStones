package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.anima.Fire;

public class WeaponTest 
{
    private Weapon fire;

    @Before
    public void init()
    {
        fire = new Fire();
    }

    @Test
    public void testConstructor()
    {
        assertTrue("Constructor creates a new Weapon", new Fire() instanceof Weapon);
    }

    @Test
    public void hitDecrementsUsesBy1()
    {
        int expectedUses = fire.getRemainingUses() -1;

        fire.hit();

		assertEquals("Using a weapon should decrease its remaining uses by 1",
		    fire.getRemainingUses(), expectedUses);
    }
}
