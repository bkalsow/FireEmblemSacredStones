package main.java.items.weapons.staves;

import main.java.items.weapons.Weapon;

public abstract class Stave extends Weapon
{
    private int EXPAwarded = 0;

    public Stave(int uses, int price, String description, String newRequiredRank,
    int newMinRange, int newMaxRange, int newWeight, int newMight, int newHit, int newCrit, int newWeaponEXP,
    String newEffect, int newEXPAwarded)
    {
        super(uses, price, description, newRequiredRank,
        newMinRange, newMaxRange, newWeight, newMight, newHit, newCrit, newWeaponEXP,
        newEffect);
        EXPAwarded = newEXPAwarded;
    }
    
    public void setEXPAwarded(int newEXP)
    {
        EXPAwarded = newEXP;
    }

    public int getExpAwarded()
    {
        return EXPAwarded;
    }

     //TODO: dynamically configure Physic's range to be user's MAG/2
     public void updateMaxRange(int usersMag)
     {
         setMaxRange(usersMag / 2);
     }
}
