package main.java.items.weapons.staves;

import main.java.items.weapons.WeaponRanks;

public class Barrier extends Stave
{
    private final static int maxUses = 15;
    private final static int weight = 0;
    private final static int might = 10;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 2250;

    public Barrier()
    {
        super(maxUses, cost, "Increases magic resitance of adjacent allies briefly", WeaponRanks.C, 1, 1,
            weight, might, hitChance, critChance, 4,
            "Increases an adjacent ally's Resitance by 7. Bonus decreases by 1 per turn.", 17);
        setName("Barrier");
    }
}
