package items.weapons.staves;

public class Sleep extends Stave
{
    private final static int maxUses = 3;
    private final static int weight = 0;
    private final static int might = 10;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 600;

    public Sleep()
    {
        super(maxUses, cost, "", "B", 1, 7,
            weight, might, hitChance, critChance, 5,
            "Inflicts Sleep to one enemy.", 11);
        setName("Sleep");
    }
}
