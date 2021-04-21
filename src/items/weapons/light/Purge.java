package items.weapons.light;

import items.weapons.Weapon;

public class Purge extends Weapon implements Light
{
    private final static int maxUses = 5;
    private final static int weight = 20;
    private final static int might = 10;
    private final static int hitChance = 75;
    private final static int critChance = 5;
    private final static int cost = 3000;

    public Purge()
    {
        super(maxUses, cost, "", "B", 3, 10,
            weight, might, hitChance, critChance, 1,
            "");
        setName("Purge");
    }
}
