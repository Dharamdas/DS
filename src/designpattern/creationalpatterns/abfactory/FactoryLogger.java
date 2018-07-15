package designpattern.creationalpatterns.abfactory;

public class FactoryLogger {
	
	public static Logger getLoggerObject(AbstructFactoryLogger factoryLogger)
	{ 
		return factoryLogger.createLogger();
	}

}
