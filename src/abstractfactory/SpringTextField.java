package abstractfactory;

/**
 * Created by Wean on 2017/3/27.
 * Spring文本框类：具体产品
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色文本框");
    }
}
