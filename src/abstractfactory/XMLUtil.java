package abstractfactory;


import javax.xml.parsers.*;
import org.w3c.dom.*;


import java.io.*;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;


/**
 * Created by Wean on 2017/3/27.
 * 配置工具类
 */
public class XMLUtil {
    public static Object getBean(){
        try {
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src/configt.xml"));

            NodeList nl=doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue().trim();

            Class c=Class.forName("abstractfactory."+cName);
            Object obj=c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
