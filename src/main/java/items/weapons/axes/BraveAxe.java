package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class BraveAxe extends Weapon implements Axe
{
    private final static int maxUses = 30;
    private final static int weight = 16;
    private final static int might = 10;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 7500;

    public BraveAxe()
    {
        super(maxUses, cost, "Can strike consecutively.",
            WeaponRanks.B, 1, 1, weight, might, hitChance,
            critChance, 1,
            "Wielder strikes twice on each attack.");
        setName("Brave Axe");
    }
}
