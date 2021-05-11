package main.java.characters.unitclasses;

public abstract class UnitClass 
{
    private ClassRank rank;
    private String className;

    public UnitClass(ClassRank newRank, String newName)
    {
        rank = newRank;
        className = newName;
    }

    public ClassRank getClassRank()
    {
        return rank;
    }

    public String getClassName()
    {
        return className;
    }
}
