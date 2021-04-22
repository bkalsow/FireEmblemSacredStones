package items.weapons.staves;

public class Rescue extends Stave
{
    private final static int maxUses = 30;
    private final static int weight = 0;
    private final static int might = 10;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 600;

    public Rescue()
    {
        super(maxUses, cost, "Moves allies from distant spaces to adjacent ones.", "E", 1, 7,
            weight, might, hitChance, critChance, 2,
            "Teleports one ally to a space adjacent to user.", 40);
        setName("Rescue");
    }
}
