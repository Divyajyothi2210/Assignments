import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class Customer implements ApplicationContextAware  {
	ApplicationContext applicationContext=null;
	public int id;
	public String name;
	public long phno;
	public address a;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public address getA() {
		return a;
	}
	@Required
	public void setA(address a) {
		this.a = a;
	}
	public void print() {
		System.out.println("custid:"+id+"\n"+"name:"+name+"\n"+"phno:"+phno+"\n"+"address:"+"\n"+"street:"+a.getStreet()+"\n"+"city:"+a.getCity()+"\n"+"state:"+a.getState()+"\n"+"zip:"+a.getZip()+"\n"+"country:"+a.getCountry());
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext=applicationContext;
		
	}
	/*
	 * public void destroy() throws Exception {
	 * System.out.println("bean is destroying"); } public void afterPropertiesSet()
	 * throws Exception { System.out.println("bean is initializing"); }
	 */
	public void init() {
		System.out.println("my init method is invoked");
	}
	public void destroy() {
		System.out.println("my destroy method is invoked");
	}

}
