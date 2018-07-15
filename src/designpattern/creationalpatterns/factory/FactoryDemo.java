package designpattern.creationalpatterns.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		
		Logger logger= FactoryLogger.getLoggerObject("DB");
		logger.log();
	}

}
