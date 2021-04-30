package main.java.items;

/**
 * This class controls the methods shared by all items.
 * @author Brandan Kalsow
 * @version 1.0
 */
public abstract class Item
{
	private int uses, price;
	private String name;
	private String description;
	private boolean infiniteUses = false;
	
	/**
	 * This method returns how many uses are left the the given item.
	 * @return an integer representing the remaining amount of times the item can be used.
	 */
	public int getRemainingUses()
	{
		return this.uses;
	}
	
	/**
	 * This method sets how many uses an item has.
	 * @param newUses The number of uses this item is to have.
	 */
	public void setUses(int newUses)
	{
		this.uses = newUses;
	}
	
	/**
	 * This method returns the current price of the given item.
	 * @return An integer representing the price of this item.
	 */
	public int getPrice()
	{
		return this.price;
	}
	
	/**
	 * This method sets the price of a given item.
	 * @param newPrice The new price of this item.
	 */
	public void setPrice(int newPrice)
	{
		this.price = newPrice;
	}
	
	/**
	 * This method gets the name of this item.
	 * @return The name of this item as a string.
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * This method sets the name of a given item.
	 * @param newName The new name of this item.
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	/**
	 * This method gets the description of this item
	 * @return The descriptoin of this item as a string
	 */
	public String getDescription()
	{
		return this.description;
	}
	
	/**
	 * This method sets the description of a given item
	 * @param newDescription the new description of this item
	 */
	public void setDescription(String newDescription)
	{
		this.description = newDescription;
	}

	/**
	 * Gets whether this item has infinite uses
	 */
	public boolean getInfiniteUses()
	{
		return this.infiniteUses;
	}

	/**
	 * This method sets whether an item has infinite uses or not
	 * @param isInfinite whether or not this item has infinite uses
	 */
	public void setInfiniteUses(boolean isInfinite)
	{
		this.infiniteUses = isInfinite;
	}

	/**
	 * This method decrements the number of uses of an item by 1.
	 */
	public void use()
	{
		if(!infiniteUses)
			this.uses--;
	}
}
