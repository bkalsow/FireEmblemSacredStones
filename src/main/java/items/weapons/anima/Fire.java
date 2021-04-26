package main.java.items.weapons.anima;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Fire extends Weapon implements Anima
{
    private final static int maxUses = 40;
    private final static int weight = 4;
    private final static int might = 5;
    private final static int hitChance = 90;
    private final static int critChance = 0;
    private final static int cost = 560;

    public Fire()
    {
        super(maxUses, cost, "",
            WeaponRanks.E, 1, 2, weight, might, hitChance, critChance, 1,
            "");
        setName("Fire");
    }
}
