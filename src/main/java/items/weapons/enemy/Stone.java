package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;
import main.java.items.weapons.dark.Dark;

public class Stone extends Weapon implements Dark
{
    private final static int maxUses = 5;
    private final static int weight = 8;
    private final static int might = 0;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Stone()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 3, weight, might, hitChance, critChance, 0,
            "Inflicts Stone on one enemy.");
        setName("Stone");
    }
}
