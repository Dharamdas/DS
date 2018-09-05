package seialization.externalizable;

import java.io.*;

public class EmpExtDemo {
    public static void main(String[] args) throws Exception{
        //Serialization
        OutputStream outputStream = new FileOutputStream("emp.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(populaqteData());

        //de serialization

        InputStream inputStream = new FileInputStream("emp.ser");
        ObjectInputStream stream = new ObjectInputStream(inputStream);
        Emp emp = (Emp)stream.readObject();
        displayData(emp);


    }
    public static void displayData(Emp emp)
    {
        System.out.println("EmpId: "+emp.getEmpId());
        System.out.println("Emp Name: "+emp.getName());
        System.out.println("Emp Addr: "+emp.getAddress());
        System.out.println("Emp Pass: "+emp.getPassword());
        System.out.println("Emp: HNo: "+emp.getHouseNo());
        System.out.println("Emp FinalVar: "+emp.getFinalvar());
    }
    public static Emp populaqteData(){
        Emp emp = new Emp();
        emp.setEmpId(101);
        emp.setName("Dharam");
        emp.setAddress("Bang");
        emp.setPassword("testing123");
        return emp;
    }
}
