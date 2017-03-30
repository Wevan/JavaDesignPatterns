package SingleTonPattern;

/**
 * Created by Wean on 2017/3/30.
 */
public class EagerSingleton {
    private static final EagerSingleton instance=new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return  instance;
    }
}
