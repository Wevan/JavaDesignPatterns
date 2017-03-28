package abstractfactory;

/**
 * Created by Wean on 2017/3/27.
 * Spring按钮类:具体产品
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
