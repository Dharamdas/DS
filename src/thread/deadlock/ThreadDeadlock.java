package thread.deadlock;

public class ThreadDeadlock {

    public static void main(String[] args) throws Exception {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread t1 = new SyncThread(obj1, obj2);
        t1.setName("t1");
        Thread t2 = new SyncThread(obj2, obj3);
        t2.setName("t2");
        Thread t3 = new SyncThread(obj3, obj1);
        t3.setName("t3");

        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();

    }
}
