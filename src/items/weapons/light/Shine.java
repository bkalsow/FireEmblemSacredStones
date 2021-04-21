package items.weapons.light;

import items.weapons.Weapon;

public class Shine extends Weapon implements Light
{
    private final static int maxUses = 20;
    private final static int weight = 8;
    private final static int might = 6;
    private final static int hitChance = 90;
    private final static int critChance = 8;
    private final static int cost = 900;

    public Shine()
    {
        super(maxUses, cost, "", "D", 1, 2,
            weight, might, hitChance, critChance, 2,
            "");
        setName("Shine");
    }
}
