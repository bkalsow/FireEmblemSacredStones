package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class PoisonClaw extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 10;
    private final static int might = 6;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 0;

    public PoisonClaw()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 1, weight, might, hitChance, critChance, 0,
            "Inflicts Poison upon contact.");
        setName("Poison Claw");
        super.setInfiniteUses(true);
    }
}
