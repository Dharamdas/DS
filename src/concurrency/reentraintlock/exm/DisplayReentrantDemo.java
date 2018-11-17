package concurrency.reentraintlock.exm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;

public class DisplayReentrantDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(new Display("thread-1",lock));
        Thread t2 = new Thread(new Display("thread-2",lock));
        t1.start();
        t2.start();

        List list = new ArrayList();
        list.add(20);
        List list1 = Collections.synchronizedList(list);
        Hashtable t = new Hashtable();
        t.put(10,20);

    }
}
