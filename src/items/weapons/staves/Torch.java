package items.weapons.staves;

public class Torch extends Stave
{
    private final static int maxUses = 10;
    private final static int weight = 0;
    private final static int might = 0;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 1000;

    public Torch()
    {
        super(maxUses, cost, "", "D", 1, 7,
            weight, might, hitChance, critChance, 5,
            "Lights up area within casting range in Fog of War. Effect decreases by 1 each turn.", 15);
        setName("Torch");
    }
}
