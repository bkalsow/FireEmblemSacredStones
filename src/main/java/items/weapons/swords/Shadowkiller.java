package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Shadowkiller extends Weapon implements Sword
{    
    private final static int maxUses = 60;
    private final static int weight = 5;
    private final static int might = 5;
    private final static int hitChance = 90;
    private final static int critChance = 5;
    private final static int cost = 0;

    public Shadowkiller()
    {
        super(maxUses, cost, "", WeaponRanks.E,
            1, 1, weight, might, hitChance, critChance, 1,
            "Effective vs. Monsters. Cannot be obtained normally.");
    }
}
