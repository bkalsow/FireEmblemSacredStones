package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;

public class KillingEdge extends Weapon implements Sword
{    
    private final static int maxUses = 20;
    private final static int weight = 7;
    private final static int might = 9;
    private final static int hitChance = 75;
    private final static int critChance = 30;
    private final static int cost = 1300;

    public KillingEdge()
    {
        super(maxUses, cost, "Improves critical hit rate.", "C",
            1, 1, weight, might, hitChance, critChance, 1, "");
    }
}
