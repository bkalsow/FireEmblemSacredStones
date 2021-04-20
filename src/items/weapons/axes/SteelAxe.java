package items.weapons.axes;

import items.weapons.Weapon;

public class SteelAxe extends Weapon implements Axe
{
    private final static int maxUses = 30;
    private final static int weight = 15;
    private final static int might = 11;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 270;

    public SteelAxe()
    {
        super(maxUses, cost, "", "E",
            1, 1, weight, might, hitChance,
            critChance, 1, "");
        setName("Steel Axe");
    }
}
