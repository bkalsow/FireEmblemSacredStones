package items.weapons.swords;

import items.weapons.Weapon;

public class Audhulma extends Weapon implements Sword
{    
    private final static int maxUses = 30;
    private final static int weight = 9;
    private final static int might = 18;
    private final static int hitChance = 85;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Audhulma()
    {
        super(maxUses, cost, "The Sacred Twin ice blade. Res +5", "S",
            1, 1, weight, might, hitChance, critChance, 1,
            "Resistance +5. Effective vs. Monsters.");
    }
}
