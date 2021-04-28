package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class FieryFang extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 5;
    private final static int might = 5;
    private final static int hitChance = 90;
    private final static int critChance = 0;
    private final static int cost = 0;

    public FieryFang()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 1, weight, might, hitChance, critChance, 0,
            "");
        setName("Fiery Fang");
        super.setInfiniteUses(true);
    }
}
