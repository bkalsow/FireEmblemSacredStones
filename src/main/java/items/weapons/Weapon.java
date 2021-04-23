package main.java.items.weapons;

import main.java.items.Item;

/**
 * @author Brandan Kalsow
 * @version 1.0
 */
public abstract class Weapon extends Item 
{
    private String requiredRank;
    private int minRange, maxRange, weight, might, hitRate, critChance, weaponEXP;
    private String effect = "";

    public Weapon(int uses, int price, String description, String newRequiredRank,
        int newMinRange, int newMaxRange, int newWeight, int newMight, int newHit, int newCrit, int newWeaponEXP,
        String newEffect)
    {
        setUses(uses);
        setPrice(price);
        setDescription(description);
        requiredRank = newRequiredRank;
        minRange = newMinRange;
        maxRange = newMaxRange;
        weight = newWeight;
        might = newMight;
        critChance = newCrit;
        weaponEXP = newWeaponEXP;
        effect = newEffect;
    }

    public String getRequiredRank()
    {
        return requiredRank;
    }

    public void setRequiredRank(String newRank)
    {
        requiredRank = newRank;
    }    

    public int getMinRange()
    {
        return minRange;
    }

    public void setMinRange(int newRange)
    {
        minRange = newRange;
    }

    public int getMaxRange()
    {
        return maxRange;
    }

    public void setMaxRange(int newRange)
    {
        maxRange = newRange;
    }

    public int getWeight()
    {
        return weight;
    }
    
    public void setWeight(int newWeight)
    {
        weight = newWeight;
    }
    
    public int getMight()
    {
        return might;
    }
    
    public void setMight(int newMight)
    {
        might = newMight;
    }
    
    public int getHit()
    {
        return hitRate;
    }
    
    public void setHit(int newHit)
    {
        hitRate = newHit;
    }
    
    public int getCrit()
    {
        return critChance;
    }

    public void setCrit(int newCrit)
    {
        critChance = newCrit;
    }
    
    public int getWeaponEXP()
    {
        return weaponEXP;
    }

    public void setWeaponEXP(int newWEXP)
    {
        weaponEXP = newWEXP;
    }

    public void setEffect(String newEffect)
    {
        effect = newEffect;
    }

    public String getEffect()
    {
        return effect;
    }

    public void hit()
    {
        this.use();
    }
}
