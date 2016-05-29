package watches;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository

public class CustomerDaoImp implements CustomerDaoInterface{
	@Autowired
private SessionFactory sf;
	
	
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public void addCustomer(Customer c)
	{
		Session s =sf.getCurrentSession();
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(c);
		t.commit();
	}
	
	
	
	
	
	
	@Override
	public void delCustomer(int id) {
		// TODO Auto-generated method stub
		
		Session s =sf.getCurrentSession();
		Transaction t=s.beginTransaction();
	Object pi=s.load(Customer.class,id);
	if(pi!=null){
		s.delete(pi);
	}

	t.commit();
	}

	@Override
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		
		Session s =sf.getCurrentSession();
		Transaction t=s.beginTransaction();
	Customer pi=(Customer)s.load(Customer.class,c.getId());
	if(pi!=null){
		pi=c;
		s.update(pi);
	}

	t.commit();
	
		
	}

	@Override
	public List<Customer> viewAllcustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>)sf.getCurrentSession().createCriteria(Customer.class).list();
		
	}

}
