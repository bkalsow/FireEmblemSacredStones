package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;

public class ShortSpear extends Weapon implements Lance
{
    private final static int maxUses =185;
    private final static int weight = 12;
    private final static int might = 9;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 900;

    public ShortSpear()
    {
        super(maxUses, cost, "", "C", 1, 2,
            weight, might, hitChance, critChance,
            1, "");
        setName("Short Spear");
    }
}
