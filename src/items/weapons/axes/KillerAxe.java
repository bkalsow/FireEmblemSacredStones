package items.weapons.axes;

import items.weapons.Weapon;

public class KillerAxe extends Weapon implements Axe
{
    private final static int maxUses = 20;
    private final static int weight = 11;
    private final static int might = 11;
    private final static int hitChance = 65;
    private final static int critChance = 30;
    private final static int cost = 1000;

    public KillerAxe()
    {
        super(maxUses, cost, "Improves critical hit rate.",
            "C", 1, 1, weight, might, hitChance, critChance,
            1, "");
        setName("Killer Axe");
    }
}
