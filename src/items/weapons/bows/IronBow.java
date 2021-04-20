package items.weapons.bows;

import items.weapons.Weapon;

public class IronBow extends Weapon implements Bow
{
    private final static int maxUses = 45;
    private final static int weight = 5;
    private final static int might = 6;
    private final static int hitChance = 85;
    private final static int critChance = 0;
    private final static int cost = 540;

    public IronBow()
    {
        super(maxUses, cost, "", "E", 2, 2,
            weight, might, hitChance, critChance,
            1, "");
        setName("Iron Bow");
    }
}
