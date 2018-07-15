package designpattern.creationalpatterns.factory;

public class DBLogger implements Logger {

	@Override
	public void log() {

		System.out.println("DB  Logger");
	}

}
