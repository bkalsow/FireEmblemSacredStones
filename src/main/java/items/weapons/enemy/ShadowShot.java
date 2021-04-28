package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;
import main.java.items.weapons.dark.Dark;

public class ShadowShot extends Weapon implements Dark
{
    private final static int maxUses = 5;
    private final static int weight = 20;
    private final static int might = 13;
    private final static int hitChance = 70;
    private final static int critChance = 5;
    private final static int cost = 0;

    public ShadowShot()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 3, 10, weight, might, hitChance, critChance, 0,
            "");
        setName("Shadow Shot");
    }
}
