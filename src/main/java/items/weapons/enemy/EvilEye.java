package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;
import main.java.items.weapons.dark.Dark;

public class EvilEye extends Weapon implements Dark
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 6;
    private final static int might = 7;
    private final static int hitChance = 85;
    private final static int critChance = 0;
    private final static int cost = 0;

    public EvilEye()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 2, weight, might, hitChance, critChance, 0,
            "");
        setName("Evil Eye");
        setInfiniteUses(true);
    }
}
