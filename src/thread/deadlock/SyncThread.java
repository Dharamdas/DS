package thread.deadlock;

public class SyncThread extends Thread {


    private Object object;
    private Object object1;

    public SyncThread(Object object,Object object1){
        this.object=object;
        this.object1=object1;
    }

    public void run(){

        String name = Thread.currentThread().getName();
        System.out.println(name+" aquaring lock on object "+object);
        synchronized (object)
        {
            System.out.println(name + " acquired lock on "+object);
            work();

            System.out.println(name + " acquiring lock on "+object1);
            synchronized (object1) {
                System.out.println(name + " acquired lock on "+object1);
                work();
            }
            System.out.println(name + " released lock on "+object1);
        }

        System.out.println(name + " released lock on "+object);
        System.out.println(name + " finished execution.");
        }

    private void work() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
