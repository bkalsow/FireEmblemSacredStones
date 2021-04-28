package main.java.items.weapons.enemy;

import main.java.items.weapons.WeaponRanks;
import main.java.items.weapons.staves.Stave;

public class Nightmare extends Stave
{
    private final static int maxUses = 1;
    private final static int weight = 0;
    private final static int might = 0;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Nightmare()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 3, weight, might, hitChance, critChance, 0,
            "Inflicts Sleep on all enemies in range.", 0);
        setName("Nightmare");
    }
}
