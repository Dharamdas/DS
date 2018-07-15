package designpattern.creationalpatterns.abfactory;

public class DBLogger implements Logger {

	@Override
	public void log() {

		System.out.println("DB  Logger");
	}

}
