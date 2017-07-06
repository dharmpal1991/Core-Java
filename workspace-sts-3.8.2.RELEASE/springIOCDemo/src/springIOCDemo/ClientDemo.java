package springIOCDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ClientDemo {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("springconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Object o = factory.getBean("id1");
		Student stu =(Student)o;
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getRollno());
		
		
	}
}
