package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class PoisonSword extends Weapon implements Sword
{    
    private final static int maxUses = 40;
    private final static int weight = 6;
    private final static int might = 3;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 0;

    public PoisonSword()
    {
        super(maxUses, cost, "", WeaponRanks.D,
            1, 1, weight, might, hitChance, critChance, 2,
            "Inflicts Poison upon contact");
    }
}
