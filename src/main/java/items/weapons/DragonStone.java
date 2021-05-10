package main.java.items.weapons;

public class DragonStone extends Weapon
{    
    private final static int maxUses = 50;
    private final static int weight = 0;
    private final static int might = 16;
    private final static int hitChance = 100;
    private final static int critChance = 15;
    private final static int cost = 0;

    public DragonStone()
    {
        super(maxUses, cost, "A stone imbued with mysterious might.  Myrrh draws strength from it.", WeaponRanks.prf,
            1, 1, weight, might, hitChance, critChance, 0,
            "Strength +12, Skil +12, Defence +15, Resistance +20.");
    }
}
