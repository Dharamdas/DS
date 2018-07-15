package thread.concurrency;

public class WorkerTaskTest {

    public static void main(String[] args) {
        WorkerTask w1 = new WorkerTask();
        WorkerTask w2 = new WorkerTask();
        WorkerTask w3 = new WorkerTask();
        WorkerTask w4 = new WorkerTask();

        w1.setNext(w2);
        w2.setNext(w3);
        w3.setNext(w4);
        w4.setNext(w1);

        Thread t1 = new Thread(w1,"Thread-1");
        Thread t2 = new Thread(w2,"Thread-2");
        Thread t3 = new Thread(w3,"Thread-3");
        Thread t4 = new Thread(w4,"Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        w1.accept(1);

        //System.out.println("All threads has printed sequence numbers");

    }
}
