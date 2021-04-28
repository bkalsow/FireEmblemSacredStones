package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class SharpClaw extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 14;
    private final static int might = 14;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 0;

    public SharpClaw()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 1, weight, might, hitChance, critChance, 0,
            "");
        setName("Sharp Claw");
        super.setInfiniteUses(true);
    }
}
