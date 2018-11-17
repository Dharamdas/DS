package concurrency.countdownlatch;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ApplicationStartupUtil{

    private static List<BaseHealthChecker> checkerList;
    private static CountDownLatch latch;

    ApplicationStartupUtil(){

        //default constructor
    }

    private static ApplicationStartupUtil instance = new ApplicationStartupUtil();

    public static ApplicationStartupUtil getInstance(){
        return instance;
    }

    public static CountDownLatch getLatch() {
        return latch;
    }

    public static boolean checkExternalService()throws Exception{

        //initialize number of latch/threads
        latch=new CountDownLatch(3);

        //add all checklist

        checkerList = new ArrayList<BaseHealthChecker>();
        checkerList.add(new NetworkHealthChecker(latch));
        checkerList.add(new CacheHealthChecker(latch));
        checkerList.add(new DatabaseHealthChecker(latch));

        //Start checking service using executor Framework
        Executor executor = Executors.newCachedThreadPool();

        for(final BaseHealthChecker checker:checkerList)
        {
            executor.execute(checker);
        }

        //now wait till all services are checked
        latch.await();


        //services are file and proceed for startup
        for(final BaseHealthChecker checker:checkerList)
        {
            if(!checker.isServiceup())
                return false;
        }


        return true;
    }


}
