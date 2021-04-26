package main.java.items.weapons.dark;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Luna extends Weapon implements Dark
{
    private final static int maxUses = 30;
    private final static int weight = 12;
    private final static int might = 0;
    private final static int hitChance = 50;
    private final static int critChance = 10;
    private final static int cost = 4200;

    public Luna()
    {
        super(maxUses, cost, "Negates enemy reistance.",
            WeaponRanks.C, 1, 2, weight, might, hitChance, critChance, 1,
            "Ignores enemy's resitance.");
        setName("Luna");
    }
}
