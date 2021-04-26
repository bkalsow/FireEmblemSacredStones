package main.java.items.weapons.anima;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Fimbulvetr extends Weapon implements Anima
{
    private final static int maxUses = 20;
    private final static int weight = 12;
    private final static int might = 13;
    private final static int hitChance = 80;
    private final static int critChance = 0;
    private final static int cost = 6000;

    public Fimbulvetr()
    {
        super(maxUses, cost, "",
            WeaponRanks.A, 1, 2, weight, might, hitChance, critChance, 1,
            "");
        setName("Fimbulvetr");
    }
}
