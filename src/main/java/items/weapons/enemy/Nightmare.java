package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Nightmare extends Weapon
{
    private final static int maxUses = 1;
    private final static int weight = 8;
    private final static int might = 0;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Nightmare()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 3, weight, might, hitChance, critChance, 0,
            "Inflicts Sleep on all enemies in range.");
        setName("Nightmare");
    }
}
