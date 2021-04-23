package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;

public class SilverSword extends Weapon implements Sword
{
    private final static int maxUses = 20;
    private final static int weight = 8;
    private final static int might = 13;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 1500;

    public SilverSword()
    {
        super(maxUses, cost, "", "A",
            1, 1, weight, might, hitChance, critChance, 1, "");
    }
}
