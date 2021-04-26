package main.java.items.weapons.staves;

import main.java.items.weapons.WeaponRanks;

public class Restore extends Stave
{
    private final static int maxUses = 10;
    private final static int weight = 0;
    private final static int might = 0;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 2000;

    public Restore()
    {
        super(maxUses, cost, "Cures all status conditions on an adjacent ally", WeaponRanks.C, 1, 1,
            weight, might, hitChance, critChance, 2,
            "Restores HP equla to (User's Magic +10) to an adjacent ally.", 11);
        setName("Restore");
    }
}
