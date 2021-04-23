package main.java.items.weapons.lances;

import main.java.items.weapons.Weapon;

public class BrightLance extends Weapon implements Lance
{
    private final static int maxUses = 60;
    private final static int weight = 8;
    private final static int might = 7;
    private final static int hitChance = 80;
    private final static int critChance = 5;
    private final static int cost = 0;

    public BrightLance()
    {
        super(maxUses, cost, "", "E", 1, 1,
            weight, might, hitChance, critChance,
            1, "Effective vs Monsters. Cannot be obtained normally.");
        setName("Bright Lance");
    }
}
