package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class DemonLight extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 0;
    private final static int might = 15;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 0;

    public DemonLight()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 3, weight, might, hitChance, critChance, 0,
            "Magic +10, Skill +10, Luck +10, Defense +10, Resistance +15.");
        setName("Demon Light");
        super.setInfiniteUses(true);
    }
}
