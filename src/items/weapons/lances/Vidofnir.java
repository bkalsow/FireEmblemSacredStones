package items.weapons.lances;

import items.weapons.Weapon;

public class Vidofnir extends Weapon implements Lance
{
    private final static int maxUses = 30;
    private final static int weight = 11;
    private final static int might = 15;
    private final static int hitChance = 85;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Vidofnir()
    {
        super(maxUses, cost, "The Sacred Twin winged Lance. Def +5", "S", 1,
            weight, might, hitChance, critChance,
            1, 1, "Defense +5. Effective vs. Monsters");
        setName("Vidofnir");
    }
}
