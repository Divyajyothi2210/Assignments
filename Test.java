import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext con;
		con =new ClassPathXmlApplicationContext("spring1.xml");
		con.registerShutdownHook();
		customer c= (customer) con.getBean("customer");
		c.print();

	}

}
