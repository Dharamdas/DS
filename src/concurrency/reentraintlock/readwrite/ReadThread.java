package concurrency.reentraintlock.readwrite;

public class ReadThread implements Runnable {

    ReentrantRWDemo rwDemo;
    ReadThread(ReentrantRWDemo rwDemo){
        this.rwDemo = rwDemo;
    }
    public void run() {
        System.out.println("Value - " + rwDemo.get("1"));
    }


}
