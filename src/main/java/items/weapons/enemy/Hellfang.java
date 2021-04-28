package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Hellfang extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 8;
    private final static int might = 13;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Hellfang()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 1, weight, might, hitChance, critChance, 0,
            "");
        setName("Hellfang");
        super.setInfiniteUses(true);
    }
}
