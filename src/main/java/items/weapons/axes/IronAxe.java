package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class IronAxe extends Weapon implements Axe
{
    private final static int maxUses = 45;
    private final static int weight = 10;
    private final static int might = 8;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 270;

    public IronAxe()
    {
        super(maxUses, cost, "", WeaponRanks.E,
            1, 1, weight, might, hitChance,
            critChance, 1, "");
        setName("Iron Axe");
    }
}
