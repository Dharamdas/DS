package thread.synchronizedkeyworduses.with;

import java.util.ArrayList;

public class Line1 {

   private ArrayList<Integer> lineList = new ArrayList<>();

    Line1(){
        lineList.add(1);
        lineList.add(2);
        lineList.add(3);
        lineList.add(5);
        lineList.add(4);
        lineList.add(6);
    }

    public synchronized void getLine(){

            try{
                System.out.println("Line "+lineList.remove(0) +" Train "+Thread.currentThread().getName());
                Thread.sleep(500);
            }catch (Exception e)
            {
                e.printStackTrace();
            }

    }


}
