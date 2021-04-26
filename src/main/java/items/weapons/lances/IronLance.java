package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class IronLance extends Weapon implements Lance
{
    private final static int maxUses = 45;
    private final static int weight = 8;
    private final static int might = 7;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 360;

    public IronLance()
    {
        super(maxUses, cost, "", WeaponRanks.E, 1, 1,
            weight, might, hitChance, critChance,
            1, "");
        setName("Iron Lance");
    }
}
