package designpattern.creationalpatterns.abfactory;

public class FileLoggerFactory implements AbstructFactoryLogger {

	
	@Override
	public Logger createLogger() {
		return new FileLogger();
	}

}
