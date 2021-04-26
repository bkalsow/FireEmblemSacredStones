package main.java.items.weapons.dark;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Fenrir extends Weapon implements Dark
{
    private final static int maxUses = 2;
    private final static int weight = 18;
    private final static int might = 15;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 9000;

    public Fenrir()
    {
        super(maxUses, cost, "", WeaponRanks.A, 1, 2,
            weight, might, hitChance, critChance, 1,
            "");
        setName("Fenrir");
    }
}
