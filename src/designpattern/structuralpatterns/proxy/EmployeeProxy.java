package designpattern.structuralpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProxy extends Employee{

	public EmployeeProxy loadEmployee()
	{
		EmployeeProxy emp = new EmployeeProxy();
		emp.setId("100");
		emp.setName("Raj");
		return emp;
	}
	
	public List<Address> getEmpAddr() {
		List<Address> empAddr =new ArrayList<Address>();
		Address ad = new Address();
		ad.sethNo("101");
		ad.setLandMark("old Madrash Road");
		Address ad1 = new Address();
		ad1.sethNo("105");
		ad1.setLandMark("HSR layout Medical");
		empAddr.add(ad);
		empAddr.add(ad1);
		
		return empAddr;
	}
}
