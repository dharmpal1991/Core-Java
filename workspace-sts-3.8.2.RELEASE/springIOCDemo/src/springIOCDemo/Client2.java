package springIOCDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client2 {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Object o = factory.getBean("id1");
		ConstructorInjectionDemo cid = (ConstructorInjectionDemo)o;
		cid.show();
		
	}

}
