package designquestion.inmemoryfilesystem;

import java.util.ArrayList;

public class Directory extends Entry {

    protected ArrayList<Entry> contents;

    public Directory(String name,Directory p)
    {
        super(name,p);

        contents = new ArrayList<Entry>();
    }



    @Override
    public int size() {
        int size=0;
        for(Entry e:contents)
        {
            size=e.size()+size;
        }
        return size;
    }

    public int numberOfFiles(){
        int fileCount=0;
        for(Entry e:contents)
        {
            if(e instanceof Directory)
            {
                fileCount++;
                Directory d = (Directory)e;
                fileCount=d.numberOfFiles()+fileCount;
            }else if(e instanceof File)
            {
                fileCount++;
            }
        }
        return fileCount;
    }
    public boolean deleteEntry(Entry entry){
       return contents.remove(entry);
    }

    public void addEntry(Entry entry){
        contents.add(entry);
    }

    protected ArrayList<Entry> getContents()
    {
        return contents;
    }

}
