package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;

public class ToxinLance extends Weapon implements Lance
{
    private final static int maxUses = 40;
    private final static int weight = 8;
    private final static int might = 4;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 0;

    public ToxinLance()
    {
        super(maxUses, cost, "", "E", 1, 1,
            weight, might, hitChance, critChance,
            1, "Inflicts Poison on contact.");
        setName("Toxin Lance");
    }        
}
