package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class ArmorSlayer extends Weapon implements Sword
{    
    private final static int maxUses = 18;
    private final static int weight = 11;
    private final static int might = 8;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 1260;

    public ArmorSlayer()
    {
        super(maxUses, cost, "Effective against knights.", WeaponRanks.D,
            1, 1, weight, might, hitChance, critChance, 2,
            "Effective against Armored units.");
    }
}
