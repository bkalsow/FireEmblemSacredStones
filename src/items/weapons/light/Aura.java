package items.weapons.light;

import items.weapons.Weapon;

public class Aura extends Weapon implements Light
{
    private final static int maxUses = 20;
    private final static int weight = 15;
    private final static int might = 12;
    private final static int hitChance = 85;
    private final static int critChance = 15;
    private final static int cost = 8000;

    public Aura()
    {
        super(maxUses, cost, "", "A", 1, 2,
            weight, might, hitChance, critChance, 1,
            "");
        setName("Aura");
    }
}
