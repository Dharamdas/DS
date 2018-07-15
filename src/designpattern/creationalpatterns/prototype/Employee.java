package designpattern.creationalpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{

	private List<String> employeeList;
	
	public Employee() {

		this.employeeList = new ArrayList<String>();
	}
	
	public Employee(List<String> list)
	{

		this.employeeList=list;
	}
	public List<String> getEmployeeList() {

		return employeeList;
	}
	public void loadData()
	{
		//read all employee data and put into list
		this.employeeList.add("Raj");
		this.employeeList.add("Ramu");
		this.employeeList.add("Shyam");
		this.employeeList.add("Dharam");
		this.employeeList.add("Manish");
		this.employeeList.add("Suhil");
		this.employeeList.add("Ravi");
		
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		/*List<String> emplist = new ArrayList<String>();
		  for(String str: this.employeeList)
			  emplist.add(str);
		  return new Employee(emplist);*/
		
		return super.clone();
	}
}
