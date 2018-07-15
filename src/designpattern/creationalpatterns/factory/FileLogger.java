package designpattern.creationalpatterns.factory;

public class FileLogger implements Logger{

	@Override
	public void log() {
		System.out.println("File Logger Class");
	}

}
