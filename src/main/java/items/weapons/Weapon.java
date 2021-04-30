package main.java.items.weapons;

import main.java.items.Item;

/**
 * This class controls the methods shared by all weapons
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

    /**
     * Gets the required rank of this weapon
     * @return the minimum required rank of this weapon as a String
     */
    public String getRequiredRank()
    {
        switch(requiredRank)
        {
            case E:
                return "E";
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
                return "-";
        }
    }

    /**
     * Sets the new required rank for this weapon
     * @param newRank the new minimum weapon rank for this weapon
     */
    public void setRequiredRank(WeaponRanks newRank)
    {
        requiredRank = newRank;
    }    

    /**
     * Returns the minimum range for this weapon
     * @return the minimum range of this weapon as an integer (min 1)
     */
    public int getMinRange()
    {
        return minRange;
    }

    /**
     * Sets the minimum range for this weapon
     * @param newRange the new minimum range for this weapon
     */
    public void setMinRange(int newRange)
    {
        if(newRange > maxRange || newRange < 1)
            throw new IllegalArgumentException("New min range can't be greater than max range.");
        
        minRange = newRange;
    }

    /**
     * Gets the maximum range for this weapon
     * @return the maximum range of this weapon as an integer (min 1)
     */
    public int getMaxRange()
    {
        return maxRange;
    }

    /**
     * Sets the maximum range for this weapon
     * @param newRange the new maximum range of this weapon
     */
    public void setMaxRange(int newRange)
    {
        if(newRange < minRange)
            throw new IllegalArgumentException("New max range can't be less than min range.");
        
        maxRange = newRange;
    }

    /**
     * Gets the weight of this weapon
     * @return the weight of this weapon as an integer
     */
    public int getWeight()
    {
        return weight;
    }
    
    /**
     * Sets the weight of this weapon
     * @param newWeight the new weight of this weapon (min 0)
     */
    public void setWeight(int newWeight)
    {
        if(newWeight < 0)
            throw new IllegalArgumentException("Weight can't be less than 0");
        
        weight = newWeight;
    }
    
    /**
     * Gets the might of this weapon
     * @return the might of this weapon as an integer
     */
    public int getMight()
    {
        return might;
    }
    
    /**
     * Sets the might of this weapon
     * @param newMight the new might of this weapon (min 0)
     */
    public void setMight(int newMight)
    {
        if(newMight < 0)
            throw new IllegalArgumentException("Might cannot be less than 0");
        
        might = newMight;
    }
    
    /**
     * Gets the hit chance of this weapon
     * @return the hit chance of this weapon as an integer
     */
    public int getHit()
    {
        return hitRate;
    }
    
    /**
     * Sets the hit chance of this weapon
     * @param newHit the new hit chance of this weapon (must be between 1 and 100)
     */
    public void setHit(int newHit)
    {
        if(newHit < 0 || newHit > 100)
            throw new IllegalArgumentException("Hit must between 0 and 100");
        
        hitRate = newHit;
    }
    
    /**
     * Gets the crit chance of this weapon
     * @return the crit chance of this weapon as an int
     */
    public int getCrit()
    {
        return critChance;
    }

    /**
     * Sets the crit chance of this weapon
     * @param newCrit the new crit chance of this weapon (must be between 1 and 100)
     */
    public void setCrit(int newCrit)
    {
        if(newCrit < 0 || newCrit > 100)
            throw new IllegalArgumentException("Crit chance must be between 0 and 100");
        
        critChance = newCrit;
    }
    
    /**
     * gets the weapon EXP earned by using this weapon
     * @retun the weapon EXP as an integer
     */
    public int getWeaponEXP()
    {
        return weaponEXP;
    }

    /**
     * Sets the Weapon EXP value for this weapon
     * @param newWEXP the new weapon EXP value (min 0)
     */
    public void setWeaponEXP(int newWEXP)
    {
        if(newWEXP < 0)
            throw new IllegalArgumentException("Weapon EXP cannot be negative.");
        weaponEXP = newWEXP;
    }

    /**
     * Gets the effect of this weapon
     */
    public String getEffect()
    {
        return effect;
    }

    /**
     * sets the effect for this werpon
     * @param newEffect the new effect of this weapon
     */
    public void setEffect(String newEffect)
    {
        effect = newEffect;
    }

    /**
     * Decrements remaining uses by 1 since this weapon has been used
     */
    public void hit()
    {
        this.use();
    }
}
