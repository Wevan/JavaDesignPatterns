package abstractfactory;

/**
 * Created by Wean on 2017/3/27.
 * 界面皮肤工厂接口：抽象工厂
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
