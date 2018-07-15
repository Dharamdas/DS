package designpattern.creationalpatterns.factory;

public class ServerConsoleLogger implements Logger {

	@Override
	public void log() {

		System.out.println("Server Consle Logger");
	}

}
