package items.weapons.light;

import items.weapons.Weapon;

public class Ivaldi extends Weapon implements Light
{
    private final static int maxUses = 30;
    private final static int weight = 10;
    private final static int might = 17;
    private final static int hitChance = 90;
    private final static int critChance = 5;
    private final static int cost = 0;

    public Ivaldi()
    {
        super(maxUses, cost, "A Sacred Twin tome. Def +5.",
            "S", 1, 2, weight, might, hitChance, critChance, 1,
            "Defense +5. Effective vs. Monsters.");
        setName("Ivaldi");
    }
}
