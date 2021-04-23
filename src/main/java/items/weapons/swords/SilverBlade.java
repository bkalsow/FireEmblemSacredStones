package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;

public class SilverBlade extends Weapon implements Sword
{    
    private final static int maxUses = 15;
    private final static int weight = 13;
    private final static int might = 14;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 1800;

    public SilverBlade()
    {
        super(maxUses, cost, "", "A",
            1, 1, weight, might, hitChance, critChance, 2, "");
    }
}
