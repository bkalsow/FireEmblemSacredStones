package items.weapons.light;

import items.weapons.Weapon;

public class Divine extends Weapon implements Light
{
    private final static int maxUses = 25;
    private final static int weight = 12;
    private final static int might = 8;
    private final static int hitChance = 85;
    private final static int critChance = 10;
    private final static int cost = 2500;

    public Divine()
    {
        super(maxUses, cost, "", "C", 1, 2,
            weight, might, hitChance, critChance, 3,
            "");
        setName("Divine");
    }
}
