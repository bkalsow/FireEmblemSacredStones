package items.weapons.lances;

import items.weapons.Weapon;

public class KillerLance extends Weapon implements Lance
{
    private final static int maxUses = 20;
    private final static int weight = 9;
    private final static int might = 10;
    private final static int hitChance = 70;
    private final static int critChance = 30;
    private final static int cost = 1200;

    public KillerLance()
    {
        super(maxUses, cost, "Improves critical hit rate.",
            "C", 1, weight, might, hitChance, critChance,
            1, 1, "");
        setName("Killer Lance");
    } 
}
