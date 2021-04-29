package main.java.characters.unitclasses;

import java.util.Random;

/**
 * This class controls the methods shared by all classes.
 * @author Brandan Kalsow
 * @version 1.0
 */
public abstract class JobClass 
{
    private final int HPCap;
    private final int strCap;
    private final int magCap;
    private final int spdCap;
    private final int sklCap;
    private final int lckCap;
    private final int defCap;
    private final int resCap;

    private int currentHP, currentMaxHP, HPGrowth;
    private int str, strGrowth;
    private int magic, magGrowth;
    private int spd, spdGrowth;
    private int skl, sklGrowth;
    private int lck, lckGrowth;
    private int def, defGrowth;
    private int res, resGrowth;
    private int level;
    private int EXP = 0;
    private final String className;
    
    public JobClass(int newCurrentMaxHP, int newMaxHP, int newHPGrowth, int newStr, int newMaxStr,
        int newStrGrowth, int newMag, int newMaxMag, int newMagGrowth,
        int newSpd, int newMaxSpd, int newSpdGrowth, int newSkl, int newMaxSkl,
        int newSklGrowth, int newLck, int newMaxLck, int newLckGrowth,
        int newDef, int newMaxDef, int newDefGrowth, int newRes, int newMaxRes, int newResGrowth, String newClassName)
    {
        currentHP = newCurrentMaxHP;
        str = newStr;
        magic = newMag;
        spd = newSpd;
        skl = newSkl;
        lck = newLck;
        def = newDef;
        res = newRes;

        HPCap = newMaxHP;
        strCap = newMaxStr;
        magCap = newMaxMag;
        spdCap = newMaxSpd;
        sklCap = newMaxSkl;
        lckCap = newMaxLck;
        defCap = newMaxDef;
        resCap = newMaxRes;

        HPGrowth = newHPGrowth;
        strGrowth = newStrGrowth;
        magGrowth = newMagGrowth;
        spdGrowth = newSpdGrowth;
        sklGrowth = newSklGrowth;
        lckGrowth = newLckGrowth;
        defGrowth = newDefGrowth;
        resGrowth = newResGrowth;

        className = newClassName;
    }

    public int getCurrentHP()
    {
        return currentHP;
    }

    public void setHP(int newHP)
    {
        currentHP = newHP;
    }

    public void heal(int restoredHealth)
    {
        if(currentHP + restoredHealth > currentMaxHP)
            currentHP = currentMaxHP;
        else
            currentHP += restoredHealth;
    }

    public void takeDamage(int incomingDamage)
    {
        currentHP -= incomingDamage - def;
    }

    public int getStr()
    {
        return str;
    }

    public int getMag()
    {
        return magic;
    }

    public int getSpd()
    {
        return spd;
    }

    public int getSkl()
    {
        return skl;
    }

    public int getLck()
    {
        return lck;
    }

    public int getDef()
    {
        return def;
    }

    public int getRes()
    {
        return res;
    }

    public int getEXP()
    {
        return EXP;
    }

    public void setEXP(int newEXP)
    {
        EXP = newEXP;
    }

    public void earnEXP(int earnedEXP)
    {
        if(level != 20)
        {
            EXP += earnedEXP;

            if(EXP >= 100)
            {
                EXP =- 100;
                levelUp();
            }
        }
    }

    public String getClassName()
    {
        return className;
    }

    private void levelUp()
    {
        Random rand = new Random();
        level++;

        if(rand.nextInt(100) < HPGrowth)
        {
            if(currentMaxHP < HPCap)
            currentMaxHP++;
        }
        if(rand.nextInt(100) < strGrowth)
        {
            if(str < strCap)
                str++;
        }
        if(rand.nextInt(100) < magGrowth)
        {
            if(magic < magCap)
            magic++;
        }
        if(rand.nextInt(100) < spdGrowth)
        {
            if(spd < spdCap)
                spd++;
        }
        if(rand.nextInt(100) < sklGrowth)
        {   
            if(skl < sklCap)
                skl++;
        }
        if(rand.nextInt(100) < lckGrowth)
        {
            if(lck < lckCap)
                lck++;
        }
        if(rand.nextInt(100) < defGrowth)
        {
            if(def < defCap)
                def++;
        }
        if(rand.nextInt(100) < resGrowth)
        {
            if(res < resCap)
                res++;
        }  
    }
}
