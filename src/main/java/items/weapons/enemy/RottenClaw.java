package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class RottenClaw extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 8;
    private final static int might = 7;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 0;

    public RottenClaw()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 1, weight, might, hitChance, critChance, 0,
            "");
        setName("Rotten Claw");
        super.setInfiniteUses(true);
    }
}
