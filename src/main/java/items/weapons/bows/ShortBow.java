package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;

public class ShortBow extends Weapon implements Bow
{
    private final static int maxUses = 22;
    private final static int weight = 3;
    private final static int might = 5;
    private final static int hitChance = 85;
    private final static int critChance = 10;
    private final static int cost = 1760;

    public ShortBow()
    {
        super(maxUses, cost, "", "D", 2, 2,
            weight, might, hitChance, critChance,
            2, "");
        setName("Short Bow");
    }
}
