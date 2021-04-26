package main.java.items.weapons.staves;

import main.java.items.weapons.WeaponRanks;

public class Heal extends Stave
{
    private final static int maxUses = 30;
    private final static int weight = 0;
    private final static int might = 10;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 600;

    public Heal()
    {
        super(maxUses, cost, "Restores HP to allies in adjacent spaces", WeaponRanks.E, 1, 1,
            weight, might, hitChance, critChance, 2,
            "Restores HP equla to (User's Magic +10) to an adjacent ally.", 11);
        setName("Heal");
    }
}
