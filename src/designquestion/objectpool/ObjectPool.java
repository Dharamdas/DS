package designquestion.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    private Hashtable<T,Long> locked,unLocked;

    private long expirationTime;

    protected ObjectPool(){
        this.expirationTime=5000;
        locked=new Hashtable<>();
        unLocked=new Hashtable<>();
    }
    protected abstract T createObject();
    protected abstract boolean validateObject(T object);
    protected abstract void close(T object);

    public synchronized T getObject(){
        long now = System.currentTimeMillis();
        T t;

        if(unLocked.size()>0)
        {
            Enumeration enumeration = unLocked.keys();
            while (enumeration.hasMoreElements())
            {
                t = (T)enumeration.nextElement();
                if((now-unLocked.get(t))>expirationTime)
                {
                    //Object has expired
                    unLocked.remove(t);
                    close(t);
                    t=null;
                }else{
                    if(validateObject(t))
                    {
                        unLocked.remove(t);
                        locked.put(t,now);
                        return t;
                    }else{
                        unLocked.remove(t);
                        close(t);
                        t=null;
                    }
                }
            }
        }
            t = createObject();
            locked.put(t,now);
            return t;
    }

    public synchronized void releasedObject(T t){
        locked.remove(t);
        unLocked.put(t,System.currentTimeMillis());

    }
}
