package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class KillerBow extends Weapon implements Bow
{
    private final static int maxUses = 20;
    private final static int weight = 7;
    private final static int might = 9;
    private final static int hitChance = 75;
    private final static int critChance = 30;
    private final static int cost = 1400;

    public KillerBow()
    {
        super(maxUses, cost, "Improves critical hit rate", WeaponRanks.C, 2, 2,
            weight, might, hitChance, critChance,
            1, "");
        setName("Killer Bow");
    }
}
