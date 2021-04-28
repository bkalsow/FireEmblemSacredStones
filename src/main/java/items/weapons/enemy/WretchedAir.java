package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class WretchedAir extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 0;
    private final static int might = 5;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 0;

    public WretchedAir()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 2, weight, might, hitChance, critChance, 0,
            "Strength +10, Skill +10, Defense +10, Resistance +10, Ignore's enemy's Defense.");
        setName("Wretched Air");
        super.setInfiniteUses(true);
    }
}
