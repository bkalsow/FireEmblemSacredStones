package items.weapons.staves;

public class Silence extends Stave
{
    private final static int maxUses = 3;
    private final static int weight = 0;
    private final static int might = 0;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 1200;

    public Silence()
    {
        super(maxUses, cost, "Halts all enemy magic for several turns",
            "B", 1, 7, weight, might, hitChance, critChance, 5,
            "Inflicts Silence to one enemy.", 30);
        setName("Silence");
    }
}
