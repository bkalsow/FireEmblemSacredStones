package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class HandAxe extends Weapon implements Axe
{
    private final static int maxUses =205;
    private final static int weight = 12;
    private final static int might = 7;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 300;

    public HandAxe()
    {
        super(maxUses, cost, "Doubles as ranged attack", WeaponRanks.E,
            1, 2, weight, might, hitChance, critChance, 1,
            "");
        setName("Hand Axe");
    }
}
