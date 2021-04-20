package items.weapons.swords;

import items.weapons.Weapon;

public class SteelSword extends Weapon implements Sword
{
    private final static int maxUses = 30;
    private final static int weight = 10;
    private final static int might = 8;
    private final static int hitChance = 75;
    private final static int critChance = 0;
    private final static int cost = 600;

    public SteelSword()
    {
        super(maxUses, cost, "", "D",
            1, 1, weight, might, hitChance, critChance, 1, "");
    }
}
