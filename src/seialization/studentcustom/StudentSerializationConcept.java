package seialization.studentcustom;

import java.io.*;

public class StudentSerializationConcept {

	public void serializeObject(OutputStream outputStream)throws Exception
	{
		System.out.println("stated Serialization");
		ObjectOutput oos = new ObjectOutputStream(outputStream);
		Student st = getDataPopulated();
		oos.writeObject(st);
		outputStream.close();
		oos.close();
		System.out.println("Done serialization");
		
	}
	public void deSerializeObject(InputStream inputStream)throws Exception
	{
		System.out.println("Started De- Serialization");
		ObjectInput ois = new ObjectInputStream(inputStream);
		Student st = (Student)ois.readObject();
		displayData(st);
		inputStream.close();
		ois.close();
		System.out.println("Done De- Serialization");
	}
	public void displayData(Student st)
	{
		System.out.println("Id : "+st.getStId());
		System.out.println("Name: "+st.getName());
		System.out.println("Address: "+st.getAddress());
		System.out.println("House NO: "+st.getHouseNo());
		System.out.println("State: "+st.getState());
		System.out.println("Password: "+st.getPassword());

	}
	public Student getDataPopulated()
	{
		Student st = new Student();
		st.setStId(201);
		st.setName("Dharam");
		st.setAddress("Hyd");
		st.setPassword("Password");
		Student.setState("Hyd state");
		return st;
	}
}
