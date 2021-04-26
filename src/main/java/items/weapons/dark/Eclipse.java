package main.java.items.weapons.dark;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Eclipse extends Weapon implements Dark
{
    private final static int maxUses = 5;
    private final static int weight = 12;
    private final static int might = 0;
    private final static int hitChance = 30;
    private final static int critChance = 0;
    private final static int cost = 4000;

    public Eclipse()
    {
        super(maxUses, cost, "Reduces enemy HP by half", WeaponRanks.B,
            3, 10, weight, might, hitChance, critChance, 8,
            "Halves enemy's HP");
        setName("Eclipse");
    }
}
