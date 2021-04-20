package items.weapons.bows;

import items.weapons.Weapon;

public class PoisonBow extends Weapon implements Bow
{
    private final static int maxUses = 40;
    private final static int weight = 5;
    private final static int might = 4;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 0;

    public PoisonBow()
    {
        super(maxUses, cost, "", "E", 2, 2,
            weight, might, hitChance, critChance,
            1, "");
        setName("Poison Bow");
    }
}
