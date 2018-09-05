package seialization.serializable.employeedefault;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class EmployeeSerializationConceptDemo {

	public static void main(String[] args)throws Exception {
		EmployeeSerializationConcept co = new EmployeeSerializationConcept();
		//serialization
		//OutputStream outputStream = new FileOutputStream("employee.txt");
		//co.serialieObject(outputStream);
		
		System.out.println();
		
		//de-serialization 
		InputStream inputStream = new FileInputStream("employee.txt");
		co.deSerializationObject(inputStream);

	}

}
