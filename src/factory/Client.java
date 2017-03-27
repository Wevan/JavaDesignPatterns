package factory;

/**
 * Created by Wean on 2017/3/26.
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory=new FileLoggerFactory();
        logger=factory.createLogger();
        logger.writeLog();
    }
}
