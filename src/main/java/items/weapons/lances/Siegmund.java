package main.java.items.weapons.lances;

import main.java.items.weapons.WeaponRanks;

public class Siegmund extends Lance
{
    private final static int maxUses = 30;
    private final static int weight = 11;
    private final static int might = 17;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Siegmund()
    {
        super(maxUses, cost, "The Sacred Twin fire lance. Str +5.",
            WeaponRanks.prf, 1, 1, weight, might, hitChance, critChance,
            1, "Ephraim Only. Strength +5. Effective vs. Monsters.");
        setName("Siegmund");
    }
}
