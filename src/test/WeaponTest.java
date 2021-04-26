package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.anima.Fire;

/**
 * for JUnit testing weapon subclasses.
 * 
 * @author Brandan Kalsow
 * @version 1.0
 */
public class WeaponTest 
{
    private Weapon fire;

    @Before
    public void init()
    {
        fire = new Fire();
    }

    /**
     * Test that the default constructor returns a new weapon
     */
    @Test
    public void testDefaultConstructor()
    {
        assertTrue("Default constructor creates a new Weapon", new Fire() instanceof Weapon);
    }

    /**
     * Test that getRequiredRank works correctly
     */
    @Test
    public void testGetRequiredRankReturnsCorrectRank()
    {
        assertTrue("Returned rank is same as expected.", fire.getRequiredRank().equals("E"));
    }

    /**
     * Test that setRequiredRank works correctly
     */
    @Test
    public void testSetRequiredRankSetsCorrectRank()
    {
        fire.setRequiredRank("S");

        assertTrue("Set rank is same as returned", fire.getRequiredRank().equals("S"));
    }

    /**
     * Test that getMinRange works correctly
     */
    @Test
    public void testGetMinRangeReturnsCorrectRange()
    {
        assertTrue("Returned min Range is same as expected.", fire.getMinRange() == 1);
    }

    /**
     * Test that setMinRange works correctly
     */
    @Test
    public void testSetMinRangeSetsCorrectRange()
    {
        fire.setMinRange(0);

        assertTrue("Set range is same as returned", fire.getMinRange() == 0);
    }

    /**
     * Test that the hit method works correctly
     */
    @Test
    public void hitDecrementsUsesBy1()
    {
        int expectedUses = fire.getRemainingUses() -1;

        fire.hit();

		assertEquals("Using a weapon should decrease its remaining uses by 1",
		    fire.getRemainingUses(), expectedUses);
    }
}
