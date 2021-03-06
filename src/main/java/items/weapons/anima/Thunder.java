package main.java.items.weapons.anima;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Thunder extends Weapon implements Anima
{
    private final static int maxUses = 35;
    private final static int weight = 6;
    private final static int might = 8;
    private final static int hitChance = 80;
    private final static int critChance = 5;
    private final static int cost = 570;

    public Thunder()
    {
        super(maxUses, cost, "",
            WeaponRanks.D, 1, 2, weight, might, hitChance, critChance, 1,
            "");
        setName("Thunder");
    }
}
