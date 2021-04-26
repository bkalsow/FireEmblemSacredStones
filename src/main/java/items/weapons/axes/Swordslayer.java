package main.java.items.weapons.axes;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Swordslayer extends Weapon implements Axe
{
    private final static int maxUses = 20;
    private final static int weight = 11;
    private final static int might = 13;
    private final static int hitChance = 80;
    private final static int critChance = 5;
    private final static int cost = 2000;

    public Swordslayer()
    {
        super(maxUses, cost, "", WeaponRanks.C,
            1, 1, weight, might, hitChance, critChance, 1,
            "Effective & Advantage vs Swords. Disadvantage vs Lances.");
        setName("Swordslayer");
    }
}
