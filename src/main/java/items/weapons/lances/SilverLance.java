package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;

public class SilverLance extends Weapon implements Lance
{
    private final static int maxUses = 20;
    private final static int weight = 10;
    private final static int might = 14;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 1200;

    public SilverLance()
    {
        super(maxUses, cost, "", "A", 1, 1,
            weight, might, hitChance, critChance,
            1, "");
        setName("Silver Lance");
    }    
}
