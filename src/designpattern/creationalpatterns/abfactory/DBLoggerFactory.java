package designpattern.creationalpatterns.abfactory;

public class DBLoggerFactory implements AbstructFactoryLogger{

	@Override
	public Logger createLogger() {
		return new DBLogger();
	}

}
