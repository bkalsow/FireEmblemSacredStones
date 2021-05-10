package main.java.items.consumables.classchange;

import java.util.ArrayList;

import main.java.characters.unitclasses.JobClass;

public class MasterSeal extends classChanger
{
    public MasterSeal()
    {
        super("For some units Lv. 10 and up who have not changed class");

        ArrayList<JobClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
        setName("Master Seal");
    }
}
