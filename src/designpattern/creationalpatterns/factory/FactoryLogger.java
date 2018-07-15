package designpattern.creationalpatterns.factory;

public class FactoryLogger {
	
	public static Logger getLoggerObject(String logName)
	{ Logger logger =null;
		  if(logName.equals("file"))
			  return logger = new FileLogger();
		  else if(logName.equals("server"))
			  return logger = new ServerConsoleLogger();
		  else if(logName.equals("DB"))
		return logger = new DBLogger();
		  return logger;
	}

}
