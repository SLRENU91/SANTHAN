package watches;
import java.util.List;


public interface DaoInterface
{
	public void addCustomer(Pojo p);
	public List<Pojo> getProducts();
	public void addDelete(int p_id);
	public void addUpdate(Pojo p);
	
	
}