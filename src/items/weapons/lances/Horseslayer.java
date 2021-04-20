package items.weapons.lances;

import items.weapons.Weapon;

public class Horseslayer extends Weapon implements Lance
{
    private final static int maxUses = 16;
    private final static int weight = 13;
    private final static int might = 7;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 1040;

    public Horseslayer()
    {
        super(maxUses, cost, "Effective against cavalry.",
            "D", 1, 1, weight, might, hitChance, critChance,
            1, "Effective vs. Horseback Units.");
        setName("Horseslayer");
    } 
}
