import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test2 {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("spring2.xml");
		question q=(question) con.getBean("ques");
		q.answerList();
		q.answerSet();
		q.answerMap();

	}

}
