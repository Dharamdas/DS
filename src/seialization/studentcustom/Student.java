package seialization.studentcustom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stId;
	private String name;
	private static String address;
	private static String state;
	private final transient int houseNo;
	private transient String password;
	private int rollno;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getRollno() {
		return rollno;
	}

	public Student() {
		this.houseNo=1099;
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
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
		Student.state = state;
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
	
	/// customing the Serialization and De serialization
	private void writeObject(ObjectOutputStream os)
	{
		
		try {
			//os.defaultWriteObject();
			os.writeObject(this.getStId());
			os.writeObject(this.getName());
			os.writeObject(this.getAddress());
			os.writeObject(this.getPassword());
			os.writeObject(this.houseNo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream is)
	{
		try{
			//is.defaultReadObject();
			this.stId =  Integer.parseInt(is.readObject().toString());
			this.name = (String)is.readObject();
			this.address = (String)is.readObject();
			this.password = (String)is.readObject();
			//this.houseNo=(Integer)is.readObject();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
