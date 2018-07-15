package designpattern.structuralpatterns.proxy;

import java.util.List;

public class Employee {
	private String name;
	private String id;
	private List<Address> empAddr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Address> getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(List<Address> empAddr) {
		this.empAddr = empAddr;
	}
	
	
}
