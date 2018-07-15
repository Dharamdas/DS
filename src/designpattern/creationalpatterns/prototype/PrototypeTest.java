package designpattern.creationalpatterns.prototype;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args)throws Exception {

		Employee e = new Employee();
		e.loadData();
		System.out.println(e.getEmployeeList());
		System.out.println("before Cloning Employee Object: "+e.hashCode());
		//after clone object
		
		Employee e1 = (Employee)e.clone();
		System.out.println("After Cloning Employee Object: "+e1.hashCode());
		System.out.println(e1.getEmployeeList());
		List<String> list = e1.getEmployeeList();
		list.remove("Raj");
		list.remove("Ravi");
		System.out.println(list);
		System.out.println(e.getEmployeeList());
		
	}

}
