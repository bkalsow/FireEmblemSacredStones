package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class SteelSword extends Weapon implements Sword
{
    private final static int maxUses = 30;
    private final static int weight = 10;
    private final static int might = 8;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 600;

    public SteelSword()
    {
        super(maxUses, cost, "", WeaponRanks.D,
            1, 1, weight, might, hitChance, critChance, 1, "");
    }
}
