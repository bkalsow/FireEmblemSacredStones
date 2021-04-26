package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class BraveSword extends Weapon implements Sword
{    
    private final static int maxUses = 30;
    private final static int weight = 12;
    private final static int might = 9;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 7500;

    public BraveSword()
    {
        super(maxUses, cost, "Can strike consecutively.", WeaponRanks.B,
            1, 1, weight, might, hitChance, critChance, 2,
            "Allows user to attack twice in one attack.");
    }
}
