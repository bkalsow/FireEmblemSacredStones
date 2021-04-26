package main.java.items.weapons.dark;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Gleipnir extends Weapon implements Dark
{
    private final static int maxUses = 30;
    private final static int weight = 20;
    private final static int might = 23;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Gleipnir()
    {
        super(maxUses, cost, "A Sacred Twin tome. SKill +5", WeaponRanks.S, 1, 2,
            weight, might, hitChance, critChance, 3,
            "Skill +5.");
        setName("Gleipnir");
    }
}
