package items.weapons.swords;

import items.weapons.Weapon;

public class Lancereaver extends Weapon implements Sword
{    
    private final static int maxUses = 15;
    private final static int weight = 9;
    private final static int might = 9;
    private final static int hitChance = 75;
    private final static int critChance = 5;
    private final static int cost = 1800;

    public Lancereaver()
    {
        super(maxUses, cost, "Strong against spears.", "C",
            1, 1, weight, might, hitChance, critChance, 2,
            "Advantage vs. Lances, disadvantage vs. Axes.");
    }
}
