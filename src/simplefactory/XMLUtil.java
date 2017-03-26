package simplefactory;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

/**
 * Created by Wean on 2017/3/26.
 */
public class XMLUtil {
    public static String getChartType(){
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src/config.xml"));
            //获取包含图标类型的文本节点
            NodeList nl=doc.getElementsByTagName("chartType");
            Node classNode=nl.item(0).getFirstChild();
            String chartType=classNode.getNodeValue().trim();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
