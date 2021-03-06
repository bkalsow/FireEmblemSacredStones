package main.java.items.weapons.lances;

import main.java.items.weapons.WeaponRanks;

public class BraveLance extends Lance
{
    private final static int maxUses = 30;
    private final static int weight = 14;
    private final static int might = 10;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 7500;

    public BraveLance()
    {
        super(maxUses, cost, "Can strike consecutively",
            WeaponRanks.B, 1, 1, weight, might, hitChance, critChance,
            1, "Allows user to attack twice in one attack.");
        setName("Brave Lance");
    }    
}
