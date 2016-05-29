package watches;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository()
public class Dao implements DaoInterface
{
@Autowired
private SessionFactory sf;
	public void addCustomer(Pojo p){
		Session s=sf.getCurrentSession();
		Transaction t= s.beginTransaction();
		s.saveOrUpdate(p);
		t.commit();
		
	
	}
	public List<Pojo> getProducts() {

		Session s=sf.getCurrentSession();
		Transaction t= s.beginTransaction();
	    List<Pojo> l= s.createCriteria(Pojo.class).list();
		t.commit();
		return l;
		
		}
	@Override
	public void addDelete(int p_id) {
		// TODO Auto-generated method stub
		Session s=sf.getCurrentSession();
		Transaction t=s.beginTransaction();
		Object pi=s.load(Pojo.class, p_id);
		if (pi!=null)
		{
			s.delete(pi);
			
		}t.commit();
		
	}
	@Override
	public void addUpdate(Pojo p) {
		// TODO Auto-generated method stub
		Session s=sf.getCurrentSession();
		Transaction t=s.beginTransaction();
		Object pi=s.load(Pojo.class, p.getP_id());
		if (pi!=null)
		{
			s.update(p);
			
		}t.commit();
		
		
	}
}

	