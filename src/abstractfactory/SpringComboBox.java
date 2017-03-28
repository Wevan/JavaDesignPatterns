package abstractfactory;

/**
 * Created by Wean on 2017/3/27.
 * Spring组合框类：具体产品
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色组合边框");
    }
}
