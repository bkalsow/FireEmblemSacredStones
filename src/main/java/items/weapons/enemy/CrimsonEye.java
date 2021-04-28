package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;
import main.java.items.weapons.dark.Dark;

public class CrimsonEye extends Weapon implements Dark
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 13;
    private final static int might = 14;
    private final static int hitChance = 70;
    private final static int critChance = 5;
    private final static int cost = 0;

    public CrimsonEye()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 2, weight, might, hitChance, critChance, 0,
            "");
        setName("Crimson Eye");
        setInfiniteUses(true);
    }
}
