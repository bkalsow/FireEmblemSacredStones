package items.weapons.staves;

public class Fortify extends Stave
{
    private final static int maxUses = 30;
    private final static int weight = 0;
    private final static int might = 10;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 600;

    public Fortify()
    {
        super(maxUses, cost, "Restores HP to all allies nearby", "E", 1, 7,
            weight, might, hitChance, critChance, 2,
            "Restores HP equla to (User's Magic +10) to all allies within casting range.", 60);
        setName("Fortify");
    }
}
