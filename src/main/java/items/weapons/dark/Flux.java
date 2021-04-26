package main.java.items.weapons.dark;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Flux extends Weapon implements Dark
{
    private final static int maxUses = 45;
    private final static int weight = 8;
    private final static int might = 7;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 900;

    public Flux()
    {
        super(maxUses, cost, "", WeaponRanks.D, 1, 2,
            weight, might, hitChance, critChance, 1,
            "");
        setName("Flux");
    }
}
