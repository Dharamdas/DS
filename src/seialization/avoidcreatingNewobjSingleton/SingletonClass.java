package seialization.avoidcreatingNewobjSingleton;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonClass implements Serializable {

    private static SingletonClass INSTANCE;


    private SingletonClass(){
        //default private const
    }

    private Object readResolve() throws ObjectStreamException {
        System.out.println("in readResolve()");
        return this.INSTANCE;
    }

    private void readObject(ObjectInputStream inputStream) throws IOException,ClassNotFoundException{
        System.out.println("in readObject()");
        inputStream.defaultReadObject();

        synchronized (SingletonClass.class)
        {
            if(INSTANCE==null)
            {
                INSTANCE=this;
            }
        }
    }
    public static SingletonClass getInstance(){
        if(INSTANCE==null)
        {
            synchronized (SingletonClass.class)
            {
                if(INSTANCE==null)
                    INSTANCE= new SingletonClass();
            }
        }
        return INSTANCE;
    }
}
