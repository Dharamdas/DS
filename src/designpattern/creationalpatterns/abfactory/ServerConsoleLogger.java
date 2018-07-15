package designpattern.creationalpatterns.abfactory;

public class ServerConsoleLogger implements Logger {

	@Override
	public void log() {

		System.out.println("Server Consle Logger");
	}

}
