package factory;

/**
 * Created by Wean on 2017/3/26.
 * 数据库日志记录器工厂类：具体工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        Logger logger=new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        Logger logger=new DatabaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        Logger logger=new DatabaseLogger();
        return logger;
    }
}
