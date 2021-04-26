package main.java.items.weapons.light;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Lightning extends Weapon implements Light
{
    private final static int maxUses = 35;
    private final static int weight = 6;
    private final static int might = 4;
    private final static int hitChance = 95;
    private final static int critChance = 5;
    private final static int cost = 630;

    public Lightning()
    {
        super(maxUses, cost, "", WeaponRanks.E, 1, 2,
            weight, might, hitChance, critChance, 1,
            "");
        setName("Lightning");
    }
}
