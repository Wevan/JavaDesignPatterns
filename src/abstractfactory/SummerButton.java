package abstractfactory;

/**
 * Created by Wean on 2017/3/27.
 * Summer按钮类：具体产品
 */
public class SummerButton implements Button{
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
