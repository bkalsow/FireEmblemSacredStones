package main.java.items.weapons.staves;

import main.java.items.weapons.WeaponRanks;

public class Physic extends Stave
{
    private final static int maxUses = 15;
    private final static int weight = 0;
    private final static int might = 10;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 3759;

    public Physic()
    {
        super(maxUses, cost, "Restores HP to allies at a distance", WeaponRanks.B, 1, 7,
            weight, might, hitChance, critChance, 2,
            "Restores HP equla to (User's Magic +10) to one ally.", 11);
        setName("Physic");
    }
}
