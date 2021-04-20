package items.weapons.axes;

import items.weapons.Weapon;

public class SilverAxe extends Weapon implements Axe
{
    private final static int maxUses = 20;
    private final static int weight = 12;
    private final static int might = 15;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 1000;

    public SilverAxe()
    {
        super(maxUses, cost, "", "A",
            1, 1, weight, might, hitChance,
            critChance, 1, "");
        setName("Silver Axe");
    }
}
