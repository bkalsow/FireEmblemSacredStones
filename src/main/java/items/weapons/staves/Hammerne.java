package main.java.items.weapons.staves;

public class Hammerne extends Stave
{
    private final static int maxUses = 3;
    private final static int weight = 0;
    private final static int might = 0;
    private final static int hitChance = 100;
    private final static int critChance = 0;
    private final static int cost = 1800;

    public Hammerne()
    {
        super(maxUses, cost, "Restores an adjacent ally's weapons to new condition.", "C", 1, 1,
            weight, might, hitChance, critChance, 8,
            "Fully restores an adjacent ally's equipped weapon to full.  Does not work on Myrrh's Dragonstone.", 40);
        setName("Hammerne");
    }
}
