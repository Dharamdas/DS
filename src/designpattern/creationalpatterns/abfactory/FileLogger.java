package designpattern.creationalpatterns.abfactory;

public class FileLogger implements Logger{

	@Override
	public void log() {
		System.out.println("File Logger Class");
	}

}
