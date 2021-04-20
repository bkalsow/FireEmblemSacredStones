package items.weapons.bows;

import items.weapons.Weapon;

public class IronBallista extends Weapon implements Bow
{
    private final static int maxUses = 5;
    private final static int weight = 20;
    private final static int might = 13;
    private final static int hitChance = 60;
    private final static int critChance = 0;
    private final static int cost = 0;

    public IronBallista()
    {
        super(maxUses, cost, "", "E", 3, 15,
            weight, might, hitChance, critChance,
            5, "Archers/Snipers/Fleet only.");
        setName("Iron Ballista");
    }
}
