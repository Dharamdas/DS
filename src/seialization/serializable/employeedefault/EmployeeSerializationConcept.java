package seialization.serializable.employeedefault;

import java.io.*;

public class EmployeeSerializationConcept {
	
	public void serialieObject(OutputStream outputStream)throws IOException
	{
		System.out.println("Started Serialization");
		ObjectOutput oos = new ObjectOutputStream(outputStream);
		Employee emp = populateData();
		oos.writeObject(emp);
		outputStream.close();
		oos.close();
		System.out.println("Done Serialization");
	}
	
	public void deSerializationObject(InputStream inputStream)throws Exception
	{
		
		System.out.println("Started De-Serialization");
		
		ObjectInput objectInput = new ObjectInputStream(inputStream);
		Employee emp = (Employee)objectInput.readObject();
		displayData(emp);
		inputStream.close();
		objectInput.close();
		System.out.println("Done Serialization");
	}
	
	public void displayData(Employee emp)
	{
		System.out.println("Id : "+emp.getEmpId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Address: "+emp.getAddress());
		System.out.println("House NO: "+emp.getHouseNo());
		System.out.println("State: "+ Employee.getState());
		System.out.println("Password: "+emp.getPassword());
		System.out.println("finalVar: "+emp.getFinalvar());

	}

	public Employee populateData()
	{
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setName("Raj");
		emp.setAddress("Bangalore");
		emp.setPassword("xxx");
		Employee.setState("Karnatka");
		return emp;
	}

}
