package factory;

/**
 * Created by Wean on 2017/3/26.
 * 日志记录器工厂接口：抽象工厂
 */
public interface LoggerFactory {
    public Logger createLogger();
    public Logger createLogger(String args);
    public Logger createLogger(Object obj);
}
