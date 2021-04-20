package items.weapons.lances;

import items.weapons.Weapon;

public class Dragonspear extends Weapon implements Lance
{
    private final static int maxUses = 30;
    private final static int weight = 8;
    private final static int might = 10;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 4500;

    public Dragonspear()
    {
        super(maxUses, cost, "Effective against wyverns.",
            "C", 1, 1, weight, might, hitChance, critChance,
            1, "Effective vs. Dragon units.");
        setName("Dragonspear");
    }
}
