package main.java.items.weapons.staves;

import main.java.items.weapons.WeaponRanks;

public class Unlock extends Stave
{
    private final static int maxUses = 30;
    private final static int weight = 0;
    private final static int might = 10;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 1500;

    public Unlock()
    {
        super(maxUses, cost, "Unlocks doors, even from a distance", WeaponRanks.D, 1, 2,
            weight, might, hitChance, critChance, 5,
            "Opens a door.", 17);
        setName("Unlock");
    }
}
