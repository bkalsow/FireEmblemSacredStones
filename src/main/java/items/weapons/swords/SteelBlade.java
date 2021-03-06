package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class SteelBlade extends Weapon implements Sword
{
    private final static int maxUses = 25;
    private final static int weight = 14;
    private final static int might = 11;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 980;

    public SteelBlade()
    {
        super(maxUses, cost, "", WeaponRanks.C,
            1, 1, weight, might, hitChance, critChance, 2, "");
    }
}
