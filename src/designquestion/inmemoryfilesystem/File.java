package designquestion.inmemoryfilesystem;

public class File extends Entry {

    private String content;
    private int size;
    File(String name,Directory p,int size){
        super(name,p);
        this.size=size;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public int size() {
        return 0;
    }


}
