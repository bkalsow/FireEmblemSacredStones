package items.weapons.staves;

public class Recover extends Stave
{
    private final static int maxUses = 15;
    private final static int weight = 0;
    private final static int might = 100;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 2250;

    public Recover()
    {
        super(maxUses, cost, "Restores all HP to allies in adjacent spaces", "C", 1, 1,
            weight, might, hitChance, critChance, 3,
            "Restores all HP to an adjacent unit", 17);
        setName("Recover");
    }
}
