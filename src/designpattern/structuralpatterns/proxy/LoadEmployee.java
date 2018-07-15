package designpattern.structuralpatterns.proxy;

public class LoadEmployee {
	
	public static Employee getEmp()
	{
		EmployeeProxy empproxy = new EmployeeProxy();
		return empproxy.loadEmployee();
	}

}
