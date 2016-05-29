package watches;

import java.util.*;

public interface CustomerDaoInterface {

	public void addCustomer(Customer c);
	public void delCustomer(int id);
	public void updateCustomer(Customer c);
	public List<Customer> viewAllcustomer();
	
}
