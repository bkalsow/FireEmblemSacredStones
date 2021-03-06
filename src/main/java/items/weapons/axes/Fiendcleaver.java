package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Fiendcleaver extends Weapon implements Axe
{
    private final static int maxUses = 60;
    private final static int weight = 10;
    private final static int might = 8;
    private final static int hitChance = 75;
    private final static int critChance = 5;
    private final static int cost = 0;

    public Fiendcleaver()
    {
        super(maxUses, cost, "", WeaponRanks.E,
            1, 1, weight, might, hitChance, critChance, 1,
            "Effective vs. Monsters. Cannot be obtained normally.");
    }
}
