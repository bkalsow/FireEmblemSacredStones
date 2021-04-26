package main.java.items.weapons.staves;

import main.java.items.weapons.WeaponRanks;

public class Mend extends Stave
{
    private final static int maxUses = 20;
    private final static int weight = 0;
    private final static int might = 20;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 1000;

    public Mend()
    {
        super(maxUses, cost, "Restores many HP to allies in adjacent spaces", WeaponRanks.D, 1, 1,
            weight, might, hitChance, critChance, 3,
            "Restores HP equla to (User's Magic +20) to an adjacent ally.", 12);
        setName("Mend");
    }
}
