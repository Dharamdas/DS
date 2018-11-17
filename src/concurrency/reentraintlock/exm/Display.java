package concurrency.reentraintlock.exm;

import java.util.concurrent.locks.ReentrantLock;

public class Display implements Runnable {

    private String threadName;
    private ReentrantLock reentrantLock;
    Display(String threadName, ReentrantLock reentrantLock){

        this.threadName=threadName;
        this.reentrantLock=reentrantLock;
    }

    @Override
    public void run() {

        System.out.println("In Display run method, thread " + threadName +
                " is waiting to get lock");
        //acquiring lock
        reentrantLock.lock();
        try{
            System.out.println("Thread " + threadName + "has got lock");

            methodA();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }
    }

    public void methodA(){
        System.out.println("In Display methodA, thread " + threadName +
                " is waiting to get lock");
        try{
            reentrantLock.lock();
            System.out.println("Thread " + threadName + "has got lock");
            System.out.println("Count of Lock held by Thread "+threadName+ " = "+reentrantLock.getHoldCount());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }
    }
}
