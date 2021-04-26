package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Sieglinde extends Weapon implements Sword
{    
    private final static int maxUses = 30;
    private final static int weight = 9;
    private final static int might = 16;
    private final static int hitChance = 90;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Sieglinde()
    {
        super(maxUses, cost, "The Sacred Twin storm blade. Str +5", WeaponRanks.prf,
            1, 1, weight, might, hitChance, critChance, 1,
            "Eirika Only. Strength +5. Effective vs Monsters.");
    }
}
