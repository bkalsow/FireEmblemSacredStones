package main.java.items.weapons.staves;

import main.java.items.weapons.WeaponRanks;

public class Warp extends Stave
{
    private final static int maxUses = 5;
    private final static int weight = 0;
    private final static int might = 0;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 7500;

    public Warp()
    {
        super(maxUses, cost, "Moves allies in adjacent spaces instantly elsewhere.", WeaponRanks.A, 1, 1,
            weight, might, hitChance, critChance, 7,
            "Teleports an adjacent unit to any traversible andviewable space on the map within the range 1-Mag/2, where Mag is the user's Magic stat.", 85);
        setName("Warp");
    }
}
