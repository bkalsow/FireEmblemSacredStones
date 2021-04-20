package items.weapons.swords;

import items.weapons.Weapon;

public class Zanbato extends Weapon implements Sword
{
    private final static int maxUses = 18;
    private final static int weight = 11;
    private final static int might = 6;
    private final static int hitChance = 75;
    private final static int critChance = 5;
    private final static int cost = 1260;

    public Zanbato()
    {
        super(maxUses, cost, "Effective against cavalry", "D",
            1, 1, weight, might, hitChance, critChance, 1,
            "Effective vs. Cavalry units");
    }
}
