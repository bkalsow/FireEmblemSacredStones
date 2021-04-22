package items.weapons.staves;

public class Berserk extends Stave
{
    private final static int maxUses = 7;
    private final static int weight = 0;
    private final static int might = 10;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 1800;

    public Berserk()
    {
        super(maxUses, cost, "", "B", 1, 7,
            weight, might, hitChance, critChance, 5,
            "Inflicts Berserk to one enemy.", 40);
        setName("Berserk");
    }
}
