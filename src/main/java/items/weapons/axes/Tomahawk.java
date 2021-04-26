package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Tomahawk extends Weapon implements Axe
{
    private final static int maxUses = 15;
    private final static int weight = 15;
    private final static int might = 14;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 3000;

    public Tomahawk()
    {
        super(maxUses, cost, "Doubles as ranged attack", WeaponRanks.A,
            1, 2, weight, might, hitChance, critChance, 1,
            "");
        setName("Tomahawk");
    }
}
