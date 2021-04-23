package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;

public class LightBrand extends Weapon implements Sword
{    
    private final static int maxUses = 25;
    private final static int weight = 9;
    private final static int might = 9;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 1250;

    public LightBrand()
    {
        super(maxUses, cost, "", "C",
            1, 2, weight, might, hitChance, critChance, 1,
            "Casts Light when attacking from range.  Inflicts magic-basded damage. Cannot critical at range.");
    }
}
