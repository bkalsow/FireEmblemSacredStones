package items.consumables.statboosters;

import items.Item;

/**
 * @author Brandan Kalsow
 * @version 1.0
 */
public abstract class StatBooster extends Item
{
	private final int MAX_USES = 1;
	
	StatBooster(String description)
	{
		setUses(MAX_USES);
		setPrice(8000);
		setDescription(description);
	}
}
