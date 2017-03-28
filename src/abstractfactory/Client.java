package abstractfactory;

/**
 * Created by Wean on 2017/3/27.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory= (SkinFactory) XMLUtil.getBean();

        bt=factory.createButton();
        tf=factory.createTextField();
        cb=factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
