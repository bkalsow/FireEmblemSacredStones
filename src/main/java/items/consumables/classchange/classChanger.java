package main.java.items.consumables.classchange;

import java.util.ArrayList;

import main.java.characters.unitclasses.JobClass;
import main.java.items.Item;

/**
 * @author Brandan Kalsow
 * @version 1.0
 */
public class classChanger extends Item
{
    private final int MAX_USES = 1;
    private ArrayList<JobClass> restrictedClasses;
	
	classChanger(String description)
	{
		setUses(MAX_USES);
		setPrice(10000);
		setDescription(description);
	}

    /**
	 * This method returns which classes may use this class changer.
	 * @return an arrayList containing the availible classes.
	 */
    public ArrayList<JobClass> getUseableClasses()
    {
        return restrictedClasses;
    }

	public void setUseableClasses(ArrayList<JobClass> newClasses)
	{
		restrictedClasses = newClasses;
	}
}
