package main.java.items.weapons.lances;

import main.java.items.weapons.WeaponRanks;

public class HeavySpear extends Lance
{
    private final static int maxUses = 16;
    private final static int weight = 14;
    private final static int might = 79;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 1200;

    public HeavySpear()
    {
        super(maxUses, cost, "Effective against knights.",
            WeaponRanks.D, 1, 1, weight, might, hitChance, critChance,
            1, "Effective vs. Armored units");
        setName("Heavy Spear");
    }
}
