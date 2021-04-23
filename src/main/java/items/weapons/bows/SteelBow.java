package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;

public class SteelBow extends Weapon implements Bow
{
    private final static int maxUses = 30;
    private final static int weight = 9;
    private final static int might = 9;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 720;

    public SteelBow()
    {
        super(maxUses, cost, "", "D", 2, 2,
            weight, might, hitChance, critChance,
            1, "");
        setName("Steel Bow");
    }
}
