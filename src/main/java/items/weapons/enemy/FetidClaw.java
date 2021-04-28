package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class FetidClaw extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 10;
    private final static int might = 12;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 0;

    public FetidClaw()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 1, weight, might, hitChance, critChance, 0,
            "");
        setName("Fetid Claw");
        super.setInfiniteUses(true);
    }
}
