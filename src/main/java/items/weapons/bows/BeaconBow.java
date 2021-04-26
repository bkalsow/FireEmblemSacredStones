package main.java.items.weapons.bows;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class BeaconBow extends Weapon implements Bow
{
    private final static int maxUses = 60;
    private final static int weight = 5;
    private final static int might = 6;
    private final static int hitChance = 85;
    private final static int critChance = 5;
    private final static int cost = 0;

    public BeaconBow()
    {
        super(maxUses, cost, "", WeaponRanks.E, 2, 2,
            weight, might, hitChance, critChance,
            1, "Effective vs. Monsters. Cannnot obtain normally.");
        setName("Beacon Bow");
    }
}
