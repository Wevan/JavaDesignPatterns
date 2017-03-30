package SingleTonPattern;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Wean on 2017/3/29.
 */
public class LoadBalancer {
    private static LoadBalancer instance=null;
    private List serverList=null;
    private LoadBalancer(){
        serverList=new ArrayList();
    }
    public static LoadBalancer getLoadBalancer(){
        if (instance==null){
            instance=new LoadBalancer();
        }
        return instance;
    }
    //增加服务器
    public void addServer(String server){
        serverList.add(server);
    }
    public void removeServer(String server){
        serverList.remove(server);
    }
    //使用Random类随机获取服务器
    public String getServer(){
        Random random=new Random();
        int i=random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }
}
