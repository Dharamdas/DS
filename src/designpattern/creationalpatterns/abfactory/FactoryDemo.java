package designpattern.creationalpatterns.abfactory;

public class FactoryDemo {

	public static void main(String[] args) {
		
		Logger logger;
		logger= FactoryLogger.getLoggerObject(new FileLoggerFactory());
		logger.log();
		logger= FactoryLogger.getLoggerObject(new DBLoggerFactory());
		logger.log();
		logger= FactoryLogger.getLoggerObject(new ServerConsoleFactory());
		logger.log();

	}

}
