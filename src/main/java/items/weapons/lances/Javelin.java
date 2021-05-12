package main.java.items.weapons.lances;

import main.java.items.weapons.WeaponRanks;

public class Javelin extends Lance
{
    private final static int maxUses = 20;
    private final static int weight = 11;
    private final static int might = 6;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 400;

    public Javelin()
    {
        super(maxUses, cost, "Doubles as ranged attack.", WeaponRanks.E, 1, 2,
            weight, might, hitChance, critChance,
            1, "");
        setName("Javelin");
    }
}
