package concurrency.reentraintlock.readwrite;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantRWDemo {


    public static void main(String... args) {
        ReentrantRWDemo rwDemo = new ReentrantRWDemo();
        // Putting some values in the map
        rwDemo.put("1", "One");
        rwDemo.put("2", "Two");
        rwDemo.put("3", "Three");


        // Starting two read threads and one write thread
        Thread rThread1 = new Thread(new ReadThread(rwDemo));
        Thread wThread = new Thread(new WriterThread(rwDemo));
        Thread rThread2 = new Thread(new ReadThread(rwDemo));
        rThread1.start();
        wThread.start();
        rThread2.start();




    }

    private Map<String,String> map = new TreeMap<>();
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    //get Method for getting value from MAP

    public String get(String key)
    {
        System.out.println("In get Method waiting to aquire lock");
        readWriteLock.readLock().lock();
        System.out.println("In get() aquired lock");
        try {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return map.get(key);
        }finally {
            readWriteLock.readLock().unlock();
            System.out.println("In get method released read lock");
        }
    }

    // Put method to store  key, value in a map

    public String put(String key,String value){

        System.out.println("In put method waiting to acquire lock");
        readWriteLock.writeLock().lock();
        System.out.println("In put method acquired write lock");
        try {
            try {

                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }

           return map.put(key,value);
        }finally {
            readWriteLock.writeLock().unlock();
            System.out.println("In put method released read lock");

        }
    }

    public void display(){
        map.entrySet().forEach(System.out::println);

    }

}
