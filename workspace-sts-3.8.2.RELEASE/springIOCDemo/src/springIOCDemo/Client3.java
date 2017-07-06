package springIOCDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client3 {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Object o = factory.getBean("id");
		Customer c = (Customer)o;
		System.out.println("Customer id:"+c.getId());
		System.out.println("Customer Name:"+c.getName());
		System.out.println("Customer Age:"+c.getAge());
		Object o1 = factory.getBean("id2");
		Customer2 c2 = (Customer2)o1;
		System.out.println("Customer Emailid:"+c2.getEmail());
		System.out.println("Customer PhoneNo:"+c2.getPhoneno());
		System.out.println("Customer Address:"+c2.getAddress());
	}

}
