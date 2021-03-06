package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class DevilAxe extends Weapon implements Axe
{
    private final static int maxUses = 20;
    private final static int weight = 18;
    private final static int might = 18;
    private final static int hitChance = 55;
    private final static int critChance = 0;
    private final static int cost = 880;

    public DevilAxe()
    {
        super(maxUses, cost, "Might injure its wielder.", WeaponRanks.E,
            1, 1, weight, might, hitChance, critChance, 8,
            "May damage wielder instead of target.");
            setName("Devil Axe");
    }
}
