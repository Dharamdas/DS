package thread.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public abstract class BaseHealthChecker implements Runnable {

    private CountDownLatch countDownLatch;
    private String serviceName;
    private boolean serviceup;


    //Get latch object in constructor so that after completing the task, thread can countDown() the latch
    BaseHealthChecker(String serviceName, CountDownLatch countDownLatch)
    {
        super();
        this.serviceName=serviceName;
        this.countDownLatch=countDownLatch;
        this.serviceup=false;
    }

    public String getServiceName() {
        return serviceName;
    }

    public boolean isServiceup() {
        return serviceup;
    }

    //This methos needs to be implemented by all specific service checker
    public abstract boolean varifyService();

    @Override
    public void run(){

        try{
            serviceup=varifyService();
        }catch (Exception e){
            e.printStackTrace();
            serviceup=false;
        }finally {
            if(countDownLatch!=null)
                countDownLatch.countDown();
        }

    }
}
