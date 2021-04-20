package items.weapons.lances;

import items.weapons.Weapon;

public class HeavySpear extends Weapon implements Lance
{
    private final static int maxUses = 16;
    private final static int weight = 14;
    private final static int might = 79;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 1200;

    public HeavySpear()
    {
        super(maxUses, cost, "Effective against knights.", "D", 1,
            weight, might, hitChance, critChance,
            1, 1, "Effective vs. Armored units");
        setName("Heavy Spear");
    }
}
