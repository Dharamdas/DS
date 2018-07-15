package designpattern.creationalpatterns.abfactory;

public class ServerConsoleFactory implements AbstructFactoryLogger{

	@Override
	public Logger createLogger() {
		return new ServerConsoleLogger();
	}

}
