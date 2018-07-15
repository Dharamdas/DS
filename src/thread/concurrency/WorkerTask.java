package thread.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class WorkerTask implements Runnable {


    private BlockingQueue<Integer> q = new LinkedBlockingDeque<>();
    WorkerTask next=null;

    public void setNext(WorkerTask next) {
        this.next = next;
    }

    public void accept(int i){
        q.add(i);
    }

    @Override
    public void run() {

        while (true){
            try {
                int i = q.take(); //block till it receive a number

                System.out.println(Thread.currentThread().getName()+" "+i);

                Thread.sleep(1000);
                if(next!=null)
                    next.accept(i+1);


            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }


    }
}
