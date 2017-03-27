package factory;

/**
 * Created by Wean on 2017/3/26.
 * 文件日志记录器：具体产品
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
