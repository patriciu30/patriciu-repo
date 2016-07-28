import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by patricia.iosifescu on 7/28/2016.
 */


public class Test {
    public static void main(String[] args){

        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Student student = (Student)factory.getBean("studentbean");
        student.displayInfo();
    }
}
