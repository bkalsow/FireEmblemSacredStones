package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Shamshir extends Weapon implements Sword
{   
    private final static int maxUses = 20;
    private final static int weight = 5;
    private final static int might = 8;
    private final static int hitChance = 75;
    private final static int critChance = 35;
    private final static int cost = 1200;

    public Shamshir()
    {
        super(maxUses, cost, "Improves critical hit rate.", WeaponRanks.D,
            1, 1, weight, might, hitChance, critChance, 2,
            "Myrmidon/Swordmaster/Assassin/Eirika/Bonewalker/Wight only.");
    }
}
