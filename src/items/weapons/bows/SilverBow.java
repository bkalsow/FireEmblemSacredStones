package items.weapons.bows;

import items.weapons.Weapon;

public class SilverBow extends Weapon implements Bow
{
    private final static int maxUses = 20;
    private final static int weight = 6;
    private final static int might = 13;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 1600;

    public SilverBow()
    {
        super(maxUses, cost, "", "A", 2, 2,
            weight, might, hitChance, critChance,
            1, "");
        setName("Silver Bow");
    }
}
