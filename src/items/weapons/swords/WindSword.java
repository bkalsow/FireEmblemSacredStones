package items.weapons.swords;

import items.weapons.Weapon;

public class WindSword extends Weapon implements Sword 
{
    private final static int maxUses = 40;
    private final static int weight = 9;
    private final static int might = 9;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 8000;

    public WindSword()
    {
        super(maxUses, cost, "", "B",
            1, 2, weight, might, hitChance, critChance, 1,
            "Casts wind magic when used from range.  Inflicts magic-based damage. Effective vs. flying units.");
    }
}
