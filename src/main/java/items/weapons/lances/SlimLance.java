package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class SlimLance extends Weapon implements Lance
{
    private final static int maxUses = 30;
    private final static int weight = 4;
    private final static int might = 4;
    private final static int hitChance = 85;
    private final static int critChance = 5;
    private final static int cost = 450;

    public SlimLance()
    {
        super(maxUses, cost, "", WeaponRanks.E, 1, 1,
            weight, might, hitChance, critChance,
            1, "");
        setName("Slim Lance");
    }    
}
