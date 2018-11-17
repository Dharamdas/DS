package thread.synchronizedkeyworduses.without;

public class Line {


    public void getLine(){
        for(int i=0;i<3;i++)
        {
            System.out.println("Line "+i +" Train "+Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }


}
