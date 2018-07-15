package thread.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CacheHealthChecker extends BaseHealthChecker {

    CacheHealthChecker(CountDownLatch latch){
        super("CacheHealthChecker Service",latch);

    }


    @Override
    public boolean varifyService() {
        System.out.println("Checking " + this.getServiceName());
        try
        {
            Thread.sleep(7000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.getServiceName() + " is UP");

        return true;
    }
}
