package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class BraveBow extends Weapon implements Bow
{
    private final static int maxUses = 30;
    private final static int weight = 12;
    private final static int might = 10;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 7500;

    public BraveBow()
    {
        super(maxUses, cost, "Can strike consecutively", WeaponRanks.B, 2, 2,
            weight, might, hitChance, critChance,
            1, "Allows user to attack twice in one attack.");
        setName("Brave Bow");
    }
}
