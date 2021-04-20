package items.weapons.swords;

import items.weapons.Weapon;

public class IronBlade extends Weapon implements Sword
{    
    private final static int maxUses = 35;
    private final static int weight = 12;
    private final static int might = 9;
    private final static int hitChance = 70;
    private final static int critChance = 0;
    private final static int cost = 980;

    public IronBlade()
    {
        super(maxUses, cost, "", "D",
            1, 1, weight, might, hitChance, critChance, 2, "");
    }
}
