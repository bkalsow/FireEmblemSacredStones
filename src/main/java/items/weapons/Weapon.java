package main.java.items.weapons;

import main.java.items.Item;

/**
 * @author Brandan Kalsow
 * @version 1.0
 */
public abstract class Weapon extends Item 
{
    private WeaponRanks requiredRank;
    private int minRange, maxRange, weight, might, hitRate, critChance, weaponEXP;
    private String effect = "";

    public Weapon(int uses, int price, String description, WeaponRanks newRequiredRank,
        int newMinRange, int newMaxRange, int newWeight, int newMight, int newHit, int newCrit, int newWeaponEXP,
        String newEffect)
    {
        if(uses < 1)
            throw new IllegalArgumentException("New weapon must have at least one use");
        if(price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        if(newMinRange > newMaxRange)
            throw new IllegalArgumentException("Min range can't be greater than max range.");
        setUses(uses);
        setPrice(price);
        setDescription(description);
        requiredRank = newRequiredRank;
        minRange = newMinRange;
        maxRange = newMaxRange;
        weight = newWeight;
        might = newMight;
        hitRate = newHit;
        critChance = newCrit;
        weaponEXP = newWeaponEXP;
        effect = newEffect;
    }

    public String getRequiredRank()
    {
        switch(requiredRank)
        {
            case D:
                return "D";
            case C:
                return "C";
            case B:
                return "B";
            case A:
                return "A";
            case S:
                return "S";
            case prf:
                return "Prf";
            default:
                return "E";
        }
    }

    public void setRequiredRank(WeaponRanks newRank)
    {
        requiredRank = newRank;
    }    

    public int getMinRange()
    {
        return minRange;
    }

    public void setMinRange(int newRange)
    {
        if(newRange > maxRange || newRange < 1)
            throw new IllegalArgumentException("New min range can't be greater than max range.");
        
        minRange = newRange;
    }

    public int getMaxRange()
    {
        return maxRange;
    }

    public void setMaxRange(int newRange)
    {
        if(newRange < minRange)
            throw new IllegalArgumentException("New max range can't be less than min range.");
        
        maxRange = newRange;
    }

    public int getWeight()
    {
        return weight;
    }
    
    public void setWeight(int newWeight)
    {
        if(newWeight < 0)
            throw new IllegalArgumentException("Weight can't be less than 0");
        
        weight = newWeight;
    }
    
    public int getMight()
    {
        return might;
    }
    
    public void setMight(int newMight)
    {
        if(newMight < 0)
            throw new IllegalArgumentException("Might cannot be less than 0");
        
        might = newMight;
    }
    
    public int getHit()
    {
        return hitRate;
    }
    
    public void setHit(int newHit)
    {
        if(newHit < 0 || newHit > 100)
            throw new IllegalArgumentException("Hit must between 0 and 100");
        
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
