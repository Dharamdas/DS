package thread.synchronizedkeyworduses.without;

public class Train extends Thread{
    private Line line;

    Train(Line line)
    {
        this.line=line;
    }

    @Override
    public void run(){
        line.getLine();
    }
}
