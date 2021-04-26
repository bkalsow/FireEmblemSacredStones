package main.java.items.weapons.light;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Ivaldi extends Weapon implements Light
{
    private final static int maxUses = 30;
    private final static int weight = 10;
    private final static int might = 17;
    private final static int hitChance = 90;
    private final static int critChance = 5;
    private final static int cost = 0;

    public Ivaldi()
    {
        super(maxUses, cost, "A Sacred Twin tome. Def +5.",
            WeaponRanks.S, 1, 2, weight, might, hitChance, critChance, 1,
            "Defense +5. Effective vs. Monsters.");
        setName("Ivaldi");
    }
}
