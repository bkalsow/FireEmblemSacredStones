package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Nidhogg extends Weapon implements Bow
{
    private final static int maxUses = 30;
    private final static int weight = 7;
    private final static int might = 18;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Nidhogg()
    {
        super(maxUses, cost, "The Sacred twin serpent bow.  Luck +5",
            WeaponRanks.S, 2, 2, weight, might, hitChance, critChance,
            1, "Luck +5. Effective vs. Monsters.");
        setName("Nidhogg");
    }
}
