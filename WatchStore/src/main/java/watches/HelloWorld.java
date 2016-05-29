package watches;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import java.io.File;
 
 
@Controller
public class HelloWorld
{
	@Autowired
	CustomerServiceInterface c;
	
	
	 
	
	
	
	@RequestMapping("/")
	public ModelAndView helloWorld() {
		System.out.println("controller");
return new ModelAndView("index");
}
	
	@RequestMapping("/addproduct")
	
	public ModelAndView addproduct() {
		System.out.println("add.controller");
ModelAndView  m =  new ModelAndView("Addproduct");
m.addObject("command", new Pojo());
return m;
}
	
	
@RequestMapping("/add")
	
	public ModelAndView addproduct1(@ModelAttribute("WatchStore")Pojo p) {
		System.out.println("add.controller");
		c.addCustomer(p);
ModelAndView  m =  new ModelAndView("index");

return m;
}
	
	
	
	
	
	
	@RequestMapping(value="/Addtocart")

	public String Addtocart(){
	    return "Addtocart";
	}
	@RequestMapping("/Allcategories")
	public ModelAndView run() {
		//ObjectMapper mapper = new ObjectMapper();

		Dao da = new Dao();
		List<Pojo> dd=da.getProducts();

		ModelAndView mv=new ModelAndView("Allcategories");
		try {
			// Convert object to JSON string
			//String jsonInString = mapper.writeValueAsString(dd);
			//System.out.println(jsonInString);
			String json=new Gson().toJson(dd);
			

			// Convert object to JSON string and pretty print
			//jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(dd);
			//System.out.println(jsonInString);
	
				mv.addObject("jj",json);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	return mv;
	

	}
	
	@RequestMapping("/Signup")
	public ModelAndView run1() {
		ModelAndView m = new ModelAndView();
		m.setViewName("Signup");
		m.addObject("command", new Pojo());
		return m;		
	}
	@RequestMapping("/addPojo")
	public ModelAndView run2(@ModelAttribute("WatchStore")Pojo p) {
		c.addCustomer(p);
		
		return new ModelAndView("upload");	
		
		}
	
	@RequestMapping ("/upload")
		public ModelAndView run10(@RequestParam("name")String name,@RequestParam("file")MultipartFile file)
		{ 
		ModelAndView m= new ModelAndView();
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				m.setViewName("index");

				

				System.out.println("You successfully uploaded file=" +rootPath+""+name);
			} catch (Exception e) {
				System.out.println("You failed to upload " + name + "  " + e.getMessage());
			}
			
			
			
		} else {
			m.setViewName("upload");
		System.out.println( "You failed to upload " + name+ " because the file was empty.");
		}
		
	return m;
	}
	
	
	
	int a;
	@RequestMapping("/upd/{id}")
	public ModelAndView run3(@PathVariable("id")int id) {
		ModelAndView m = new ModelAndView();
		m.setViewName("update");
		a=id;
		m.addObject("command", new Pojo());
		return m;		
	}
	@RequestMapping("/update")
	public ModelAndView run4(@ModelAttribute("WatchStore")Pojo p) {
		ModelAndView m = new ModelAndView();
		m.setViewName("redirect:/viewproducts");
		p.setP_id(a);
	c.addUpdate(p);
		return m;		
	}
	
	@RequestMapping("/delete")
	public ModelAndView run4()
	{
		ModelAndView m =new ModelAndView();
		m.setViewName("delete");
		m.addObject("command", new Pojo());
		return m;
	}
	
	@RequestMapping(value="/del/{p_id}")
	public ModelAndView delprod(@PathVariable("p_id")int id)
	{System.out.println("delete");
		ModelAndView m =new ModelAndView();
		m.setViewName("index");
		c.addDelete(id);
		return m;		
	}
	
	@RequestMapping("/viewproducts")
	public ModelAndView run5() {
		ModelAndView m = new ModelAndView();
		m.setViewName("viewproducts");
		m.addObject("ls", c.getProducts());
		return m;		
	}
	@RequestMapping(value="/Loginn",method=RequestMethod.GET)
	public ModelAndView run6() {
		ModelAndView m= new ModelAndView();
		m.setViewName("Loginn");
		//m.addObject("ls", c.getProducts());
		return m;	
	}
	
	@RequestMapping(value="/AboutUS",method=RequestMethod.GET)
	public ModelAndView run7() {
		ModelAndView m= new ModelAndView();
		System.out.println("msg from aboutus");
		m.setViewName("AboutUs");
		//m.addObject("ls", c.getProducts());
		return m;	
	}
	
	
	@RequestMapping(value="/signin",method=RequestMethod.GET)
		public String addCustomer(Principal p)
		{	
	return "AllCategories";
}
	 }
