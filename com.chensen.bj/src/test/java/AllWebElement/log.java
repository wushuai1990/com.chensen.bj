package AllWebElement;

/**
 * 日志类
 */
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log {
	static {
		PropertyConfigurator.configure("cnf/log4j.properties");
	}
	static Logger logger = Logger.getLogger(log.class);
	
	public static void info(String message){
		logger.info(message);
	}
	public static void error(String message){
		logger.error(message);
		
	}

}
