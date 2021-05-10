package main.java.items.consumables.classchange;

import java.util.ArrayList;

import main.java.characters.unitclasses.JobClass;

public class LunarBrace extends classChanger
{
    public LunarBrace()
    {
        super("For Eirika");

        ArrayList<JobClass> classes = new ArrayList<>();
        //TODO: add restricted classes after they are created
        setUseableClasses(classes);
        setName("Lunar Brace");
    }
}
