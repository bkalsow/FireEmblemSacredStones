package main.java.items.weapons.enemy;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class LethalTalon extends Weapon
{
    private final static int maxUses = Integer.MAX_VALUE;
    private final static int weight = 12;
    private final static int might = 10;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 0;

    public LethalTalon()
    {
        super(maxUses, cost, "",
            WeaponRanks.F, 1, 1, weight, might, hitChance, critChance, 0,
            "Inflicts Poison upon contact.");
        setName("Lethal Talon");
        super.setInfiniteUses(true);
    }
}
