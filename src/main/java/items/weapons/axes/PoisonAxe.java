package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class PoisonAxe extends Weapon implements Axe
{
    private final static int maxUses = 40;
    private final static int weight = 10;
    private final static int might = 4;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 0;

    public PoisonAxe()
    {
        super(maxUses, cost, "", WeaponRanks.D,
            1, 1, weight, might, hitChance,
            critChance, 1, 
            "Inflicts Poison upon contact.");
        setName("Poison Axe");
    }
}
