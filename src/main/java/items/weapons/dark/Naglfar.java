package main.java.items.weapons.dark;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Naglfar extends Weapon implements Dark
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 18;
    private final static int might = 25;
    private final static int hitChance = 95;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Naglfar()
    {
        super(maxUses, cost, "", WeaponRanks.S, 1, 2,
            weight, might, hitChance, critChance, 1,
            "");
        setName("Naglfar");
        setInfiniteUses(true);
    }
}
