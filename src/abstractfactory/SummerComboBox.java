package abstractfactory;

/**
 * Created by Wean on 2017/3/27.
 * Summer组合框类：具体产品
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色组合边框");
    }
}
