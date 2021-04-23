package main.java.items.weapons.staves;

public class Latona extends Stave
{
    private final static int maxUses = 3;
    private final static int weight = 0;
    private final static int might = Integer.MAX_VALUE;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 0;

    public Latona()
    {
        super(maxUses, cost, "A Sacred Twin staff.  The ancient Staff of Latona", "S", 1, 100,
            weight, might, hitChance, critChance, 1,
            "Restores all HP and status conditions to all allies, excluding the user.", 10);
        setName("Latona");
    }
}
