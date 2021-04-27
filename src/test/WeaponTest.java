package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;
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
        fire.setRequiredRank(WeaponRanks.S);

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
        fire.setMinRange(2);

        assertTrue("Set range is same as returned", fire.getMinRange() == 2);
    }

    /**
     * Test that setMinRange fails for minRange > maxRange
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMinRangeFailsForNewMinGreaterThanMax()
    {
        fire.setMinRange(3);
    }

    /**
     * Test that setMinRange fails for range < 1
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMinRangeFailsForRangeLessThan1()
    {
        fire.setMinRange(0);
    }

    /**
     * Test that getMaxRange works correctly
     */
    @Test
    public void getMaxRangeReturnsCorrectRange()
    {
        assertTrue("Returned expected max range", fire.getMaxRange() == 2);
    }

    /**
     * Test that setMaxRange works for new max range >= min range
     */
    @Test
    public void setMaxRangeSetsCorrectRange()
    {
        fire.setMaxRange(3);

        assertTrue("New max range should be 3.", fire.getMaxRange() == 3);
    }

    /**
     * Test that setMaxRange fails on new maxRange < min range
     */
    @Test(expected = IllegalArgumentException.class)
    public void setMaxRangeFailsForMaxRangeLessThanMinRange()
    {
        fire.setMaxRange(0);
    }

    /**
     * Tests if getWeight works correctly
     */
    @Test
    public void getWeightReturnsCorrectValue()
    {
        assertTrue("Weight should match", fire.getWeight() == 4);
    }

    /**
     * Tests if set weight works correctly
     */
    @Test
    public void setWeightCorrectlySetsWeight()
    {
        fire.setWeight(3);

        assertTrue("Weight should be 3", fire.getWeight() == 3);
    }

    /**
     * Tests to make sure negative weights aren't possible
     */
    @Test(expected = IllegalArgumentException.class)
    public void setWeightFailsForNegativeValue()
    {
        fire.setWeight(-1);
    }

    /**
     * Tests if getMight works correctly
     */
    @Test
    public void testGetMight()
    {
        assertTrue("Might should be 5", fire.getMight() == 5);
    }

    /**
     * Tests if setMight works correctly
     */
    @Test
    public void testSetMightWorksForValidInput()
    {
        fire.setMight(7);

        assertTrue("Might should be 7", fire.getMight() == 7);
    }

    /**
     * Tests if might can be less than 0
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMightFailsForNegativeMight()
    {
        fire.setMight(-1);
    }

    /**
     * Tests if getHit works correctly
     */
    @Test
    public void testGetHitWorksCorrectly()
    {
        assertTrue("Hit should be 90", fire.getHit() == 90);
    }

    /**
     * Tests if setHit works for positive input
     */
    @Test
    public void setHitWorksForPositiveInput()
    {
        fire.setHit(100);

        assertTrue("Hit should be 100", fire.getHit() == 100);
    }

    /**
     * Hit cannot be greater than 100
     */
    @Test(expected = IllegalArgumentException.class)
    public void setHitFailsForValueGreaterThan100()
    {
        fire.setHit(101);
    }

    /**
     * Hit cannot be less than 0
     */
    @Test(expected = IllegalArgumentException.class)
    public void setHitFailsForValueLessThan0()
    {
        fire.setHit(-1);
    }

    /**
     * Tests that getCrit works correctly
     */
    @Test
    public void testGetCritReturnsCorrectValue()
    {
        assertTrue("Crit should be 0", fire.getCrit() == 0);
    }

    /**
     * Tests that setCrit works for valid value
     */
    @Test
    public void testSetCritWorksForValidValue()
    {
        fire.setCrit(50);

        assertTrue("Crit should be 50", fire.getCrit() == 50);
    }

    /**
     * Crit cannot be less than 0
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCritShouldFailForNewCritLessThan0()
    {
        fire.setCrit(-1);
    }

    /**
     * Crit cannot be greater than 100
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCritShouldFailForNewCritGreaterThan100()
    {
        fire.setCrit(101);
    }

    /**
     * Tests that getWeaponEXP works correctly
     */
    @Test
    public void testGetWeaponEXPWorksCorrectly()
    {
        assertTrue("Weapon EXP should be 1.", fire.getWeaponEXP() == 1);
    }

    /**
     * Tests taht setWeaponEXP works correctly
     */
    @Test
    public void testSetWeaponEXPWorksForValidValue()
    {
        fire.setWeaponEXP(2);

        assertTrue("Weapon EXP should be 2.", fire.getWeaponEXP() == 2);
    }

    /**
     * WeaponEXP cannot be negative
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetWeaponEXPFailsForNegativeValue()
    {
        fire.setWeaponEXP(-1);
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
