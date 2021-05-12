package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public abstract class Lance extends Weapon
{

    public Lance(int uses, int price, String description, WeaponRanks newRequiredRank,
        int newMinRange, int newMaxRange, int newWeight, int newMight, int newHit,
        int newCrit, int newWeaponEXP, String newEffect) 
    {
        super(uses, price, description, newRequiredRank, newMinRange, newMaxRange, newWeight, newMight, newHit, newCrit,
                newWeaponEXP, newEffect);
    }
    
}
