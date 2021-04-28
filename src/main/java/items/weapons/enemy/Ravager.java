package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Ravager extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 0;
    private final static int might = 15;
    private final static int hitChance = 85;
    private final static int critChance = 10;
    private final static int cost = 0;

    public Ravager()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 1, weight, might, hitChance, critChance, 0,
            "Magic +15, Skill +15, Defense +15, Resistance +10, Ignore's enemy's Defense.");
        setName("Ravager");
        super.setInfiniteUses(true);
    }
}
