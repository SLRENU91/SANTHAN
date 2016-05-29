
package watches;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Pojo { 
	@Column
	@NotEmpty
		private String p_name; 
		@Id
		private int p_id; 
		@Column
		@NotEmpty
		private int p_cost; 
		@Column
		@NotEmpty
		private String Url;
		@Column
		@NotEmpty
		private String image;

		public String getImage() {
			return image;
		}  
		public void setImage(String image) {
			this.image = image;
		}
		public String getUrl() {
			return Url;
		}
		public void setUrl(String url) {
			Url = url;
		}
		public String getP_name()
		{
			return p_name;
			
		}
        public void setP_name(String P_name)
        {
        	this.p_name = P_name;
        }
        
        
        public int getP_id()
        {
        	return p_id;
        }
	
	   public void setP_id(int P_id)
	   {
		   this.p_id=P_id;
		   
	   }
	public int getP_cost()
	{
		return p_cost;
		
	}
	public void setP_cost(int P_cost)
	{
	this.p_cost= P_cost;
	}
	public void getProducts() {
		// TODO Auto-generated method stub
		
	}
	}