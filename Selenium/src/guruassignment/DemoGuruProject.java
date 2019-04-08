package guruassignment;

public class DemoGuruProject {

	public static void main(String[] args) {
		
		guruProject gp = new guruProject();
		
		gp.invokeBrowser();
		
		gp.login("mngr188871", "YpYrAta");
		
		gp.newCustomer();
		
		String customerId = gp.customerId();
		
		System.out.println("Customer ID :"+ customerId);
		
		gp.editCustomer();
		
		gp.deleteCustomer();
		

	}
  

	
}
