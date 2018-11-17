package thread.synchronizedkeyworduses.with;

public class Train extends Thread{
    private Line1 line;

    Train(Line1 line)
    {
        this.line=line;
    }

    @Override
    public void run(){
        line.getLine();
    }
}
