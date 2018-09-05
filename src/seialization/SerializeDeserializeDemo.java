package seialization;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class SerializeDeserializeDemo {
    public static void main(String[] args) {

        Sub sub = new Sub(8);
        Super sup = new Super();

        try {
            OutputStream fout = new FileOutputStream("ser.txt");
            ObjectOutput oout = new ObjectOutputStream(fout);
            System.out.println("Serialization process has started, serializing objects...");
            oout.writeObject(sup);
            oout.writeObject(sub);
            fout.close();
            oout.close();
            System.out.println("Object Serialization completed.");

            // de-serialization
            InputStream finput = new FileInputStream("ser.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(finput);
            Super aSuper = (Super)objectInputStream.readObject();
            System.out.println("Super Class Attribute: "+aSuper.getName());
           // Sub asub = (Sub) objectInputStream.readObject();
           // System.out.println("Sub class Attribute: "+asub.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
