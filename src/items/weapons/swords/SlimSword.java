package items.weapons.swords;

import items.weapons.Weapon;

public class SlimSword extends Weapon implements Sword
{  
    private final static int maxUses = 30;
    private final static int weight = 2;
    private final static int might = 3;
    private final static int hitChance = 100;
    private final static int critChance = 5;
    private final static int cost = 480;

    public SlimSword()
    {
        super(maxUses, cost, "", "E",
            1, 1, weight, might, hitChance, critChance, 1, "");
    }
}
