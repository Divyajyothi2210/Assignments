import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.naveen.Customer;
public class customerservice {
	private static Map<Long,Customer> customers=Database.getCustomers();
    public Customerservice() {
    	customers.put(1L, new Customer(1,"divya","IT","Head",50000));
    	customers.put(2L, new Customer(2,"jyothi","Business","Assistant",65000));
    	
    }
    public List<Customer> getAllCustomers(){
    	return new ArrayList<Customer>(customers.values());
    }
    public Customer getCustomer(Long id) {
		return customers.get(id);
    	
    }
    
	
	public Customer addCustomer(Customer customer) {
		customer.setId(customers.size()+1);
		customers.put(customer.getId(),customer);
		return customer;
	}
	public Customer updateCustomer(Customer customer) {
		if(customer.getId()<=0)
		{
			return null;
		}
		customers.put(customer.getId(),customer);
		return customer;
	}
	
	public Customer deleteCustomer(Long id) {
		return customers.remove(id);
	}
}
	
	


