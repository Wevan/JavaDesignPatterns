package abstractfactory;

/**
 * Created by Wean on 2017/3/27.
 * Summer文本框类：具体产品
 */
public class SummerTextField implements TextField{
    @Override
    public void display() {
        System.out.println("显示蓝色文本框");
    }
}
