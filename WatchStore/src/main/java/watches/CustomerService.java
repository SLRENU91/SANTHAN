package watches;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service()
public class CustomerService implements CustomerServiceInterface{
	@Autowired
	DaoInterface d;
	

	
	public void addCustomer(Pojo p) {
		
		d.addCustomer(p);
		// TODO Auto-generated method stub
		
	}

	
	public List<Pojo> getProducts() {
		// TODO Auto-generated method stub
		return d.getProducts();
	}


	@Override
	public void addDelete(int p_id) {
		// TODO Auto-generated method stub
		d.addDelete( p_id);
	}


	@Override
	public void addUpdate(Pojo p) {
		// TODO Auto-generated method stub
		d.addUpdate(p);
	}

}
