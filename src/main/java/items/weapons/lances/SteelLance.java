package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class SteelLance extends Weapon implements Lance
{
    private final static int maxUses = 30;
    private final static int weight = 13;
    private final static int might = 10;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 480;

    public SteelLance()
    {
        super(maxUses, cost, "", WeaponRanks.D,
            1, 1, weight, might, hitChance,
            critChance, 2, "");
        setName("Steel Lance");
    }    
}
