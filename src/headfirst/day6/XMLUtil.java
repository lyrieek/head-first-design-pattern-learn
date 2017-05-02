package headfirst.day6;


import headfirst.day6.factory.ChicagoPizzaStory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.lang.reflect.Constructor;

/**
 * Created by thunder on 2017/5/2.
 */
public class XMLUtil {

    public static void main(String[] args) {
        ChicagoPizzaStory nyPizzaStory = (ChicagoPizzaStory) XMLUtil.getBean("ChicagoPizza");
        System.out.println(nyPizzaStory);
    }

    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String beanName) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("G:\\IdeaProjects\\DesignMode\\src\\headfirst\\day6\\config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName(beanName);
            Node node = nl.item(0).getFirstChild();
            //得到xxStore
            Node node1 = node.getNextSibling();
            //得到xxFactory
            Node node2 = node1.getNextSibling().getNextSibling();

            String cName = node1.getFirstChild().getNodeValue();
            String cName2 = node2.getFirstChild().getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Class c2 = Class.forName(cName2);

            //得到Store的构造器，参数是Factory
            Constructor construct = c.getConstructor(c2);
            Object obj = construct.newInstance(c2.newInstance());
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
