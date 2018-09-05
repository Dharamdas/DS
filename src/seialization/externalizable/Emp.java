package seialization.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Emp implements Externalizable {
    private static final long serialVersionUID = 1L;
    private int empId;
    private String name;
    private String address;
    private static String state; // not participating
    private transient String password; // not participating
    private final transient int  houseNo;  // is not participating in serialization
    private final String finalvar;

    Emp(){
        System.out.println("Emp() Default Constructor");
        this.houseNo=1234;
        this.finalvar="text123";
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("WriteExternal Method");
            out.write(this.empId);
            out.writeObject(this.name);
            out.writeObject(this.address);
            out.writeObject(this.finalvar);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("ReadExternal Method");

        this.empId=in.readInt();
        this.name=(String) in.readObject();
        this.address=(String)in.readObject();
        //this.finalvar=(String) in.readObject();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        Emp.state = state;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public String getFinalvar() {
        return finalvar;
    }
}
