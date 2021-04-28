package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;
import main.java.items.weapons.dark.Dark;

public class DemonSurge extends Weapon implements Dark
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 10;
    private final static int might = 11;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 0;

    public DemonSurge()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 2, weight, might, hitChance, critChance, 0,
            "");
        setName("Demon Surge");
        super.setInfiniteUses(true);
    }
}
