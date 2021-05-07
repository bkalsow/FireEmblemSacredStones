package main.java.items.consumables.miscellaneous;

import main.java.items.Item;

public class MemberCard extends Item
{
    public MemberCard()
    {
        super();
        setName("Member Card");
        setDescription("If someone with this card stops in a suspicious space...");
        setPrice(6000);
        setUses(1);
    }
}
