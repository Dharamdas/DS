package seialization.employeedefault;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String name;
	private String address;
	private static String state; // not participating
	private transient String password; // not participating
	private final transient int  houseNo;  // is not participating in serialization
	
	public Employee() {
	  this.houseNo=100001;
	}
	
	public static String getState() {
		return state;
	}
	public static void setState(String state) {
		Employee.state = state;
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

}
