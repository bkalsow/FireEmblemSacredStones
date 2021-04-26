package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Rapier extends Weapon implements Sword
{    
    private final static int maxUses = 50;
    private final static int weight = 5;
    private final static int might = 7;
    private final static int hitChance = 95;
    private final static int critChance = 10;
    private final static int cost = 0;

    public Rapier()
    {
        super(maxUses, cost, "Effective against infantry.", WeaponRanks.prf,
            1, 1, weight, might, hitChance, critChance, 2,
            "Eirika Only. Effective vs. Armored and Cavalry units.");
    }
}
