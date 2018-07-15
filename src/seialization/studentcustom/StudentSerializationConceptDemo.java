package seialization.studentcustom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StudentSerializationConceptDemo {

	public static void main(String[] args) throws Exception{
		StudentSerializationConcept st= new StudentSerializationConcept();
		//serializing object
		OutputStream outputStream = new FileOutputStream("student.txt");
		st.serializeObject(outputStream);
		
		System.out.println();
		
		//de-serializing object
		InputStream inputStream = new FileInputStream("student.txt");
		st.deSerializeObject(inputStream);
	}

}
