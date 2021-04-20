package items.consumables.classchange;

import java.util.ArrayList;

import items.Item;

/**
 * @author Brandan Kalsow
 * @version 1.0
 */
public class classChanger extends Item
{
    private final int MAX_USES = 1;
    private ArrayList<String> restrictedClasses;
	
	classChanger(String description, ArrayList<String> classes)
	{
		setUses(MAX_USES);
		setPrice(10000);
		setDescription(description);
        restrictedClasses = classes;
	}

    /**
	 * This method returns which classes may use this class changer.
	 * @return an arrayList containing the availible classes.
	 */
    public ArrayList<String> getAvailibleClasses()
    {
        return restrictedClasses;
    }
}
