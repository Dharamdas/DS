package concurrency.reentraintlock.readwrite;

public class WriterThread implements Runnable{

    ReentrantRWDemo rwDemo;
    WriterThread(ReentrantRWDemo rwDemo){
        this.rwDemo = rwDemo;
    }
    public void run() {
        rwDemo.put("4", "Four");
    }
}
