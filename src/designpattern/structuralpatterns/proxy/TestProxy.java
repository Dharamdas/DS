package designpattern.structuralpatterns.proxy;

import java.util.List;

public class TestProxy {

	public static void main(String[] args) {

		Employee emp = LoadEmployee.getEmp();
		System.out.println("EmpID: "+emp.getId());
		System.out.println("EmpNAme: "+emp.getName());

		List<Address> list = emp.getEmpAddr();
		for(Address ad : list)
		{	System.out.println("HNO: "+ad.gethNo());
		    System.out.println("Land Mark: "+ad.getLandMark());
		}
	}

}
