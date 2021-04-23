package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;

public class IronSword extends Weapon implements Sword
{    
    private final static int maxUses = 46;
    private final static int weight = 5;
    private final static int might = 5;
    private final static int hitChance = 90;
    private final static int critChance = 0;
    private final static int cost = 460;

    public IronSword()
    {
        super(maxUses, cost, "", "E",
            1, 1, weight, might, hitChance, critChance, 1, "");
    }
}
