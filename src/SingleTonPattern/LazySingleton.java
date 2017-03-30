package SingleTonPattern;

/**
 * Created by Wean on 2017/3/30.
 */
public class LazySingleton {
    private volatile static LazySingleton instance=null;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (instance==null){
            synchronized (LazySingleton.class){
                if (instance == null) {
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }
}
