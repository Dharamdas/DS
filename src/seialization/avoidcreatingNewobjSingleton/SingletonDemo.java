package seialization.avoidcreatingNewobjSingleton;

import java.io.*;

public class SingletonDemo {

    public static void main(String[] args) {
        System.out.println("Are objects same before serialization : "+ (SingletonClass.getInstance() == SingletonClass.getInstance()) );
        try{

            //serialization
            OutputStream outputStream = new FileOutputStream("dk.ser");
            ObjectOutputStream stream = new ObjectOutputStream(outputStream);
            stream.writeObject(SingletonClass.getInstance());
            //de-serialization
            InputStream inputStream = new FileInputStream("dk.ser");
            ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
            SingletonClass instance = (SingletonClass)inputStream1.readObject();
            System.out.println("Are objects same after serialization : "+ (SingletonClass.getInstance() == instance) );

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

