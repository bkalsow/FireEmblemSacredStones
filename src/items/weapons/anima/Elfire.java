package items.weapons.anima;

import items.weapons.Weapon;

public class Elfire extends Weapon implements Anima
{
    private final static int maxUses = 30;
    private final static int weight = 10;
    private final static int might = 10;
    private final static int hitChance = 86;
    private final static int critChance = 0;
    private final static int cost = 1200;

    public Elfire()
    {
        super(maxUses, cost, "",
            "E", 1, 2, weight, might, hitChance, critChance, 2,
            "");
        setName("Elfire");
    }
}
