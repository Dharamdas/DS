package designquestion.inmemoryfilesystem;

public abstract class Entry {

    protected Directory parent;
    protected long created;
    protected long lastUpdated;
    protected long lastAccessed;
    protected String name;

    Entry(String name,Directory directory)
    {
        this.parent=directory;
        this.name=name;

        created=System.currentTimeMillis();
        lastAccessed=System.currentTimeMillis();
        lastUpdated=System.currentTimeMillis();
    }


    public boolean delete(Entry entry){
        if(parent==null)
            return false;
        return parent.deleteEntry(entry);
    }

    public abstract int size();

    /* Getters and setters. */
    public long getcreationTime()
    {
        return created;
    }
    public long getLastUpdatedTime()
    {
        return lastUpdated;
    }
    public long getLastAccessedTime()
    {
        return lastAccessed;
    }
    public void changeName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }



}
