package main.java.items.weapons.swords;

import main.java.items.weapons.Weapon;
import main.java.items.weapons.WeaponRanks;

public class Runesword extends Weapon implements Sword
{    
    private final static int maxUses = 15;
    private final static int weight = 11;
    private final static int might = 12;
    private final static int hitChance = 65;
    private final static int critChance = 0;
    private final static int cost = 3300;

    public Runesword()
    {
        super(maxUses, cost, "Imbued with dark magic.", WeaponRanks.A,
            1, 2, weight, might, hitChance, critChance, 1,
            "Casts Nosferatu when used from range.  Restored HP equal to damage dealt.  Inflicts magic based damage.");
    }
}
