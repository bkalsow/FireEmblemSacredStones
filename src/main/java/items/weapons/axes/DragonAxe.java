package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class DragonAxe extends Weapon implements Axe
{
    private final static int maxUses = 30;
    private final static int weight = 11;
    private final static int might = 12;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 4500;

    public DragonAxe()
    {
        super(maxUses, cost, "", WeaponRanks.C,
            1, 1, weight, might, hitChance, critChance, 1,
            "Effective vs. Dragon units");
    }
}
