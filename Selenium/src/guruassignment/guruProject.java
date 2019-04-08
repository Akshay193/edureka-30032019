package guruassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guruProject {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay/eclipse-workspace/libs/chromedriver_07042019/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/v4/");
		
	}
	
    public void login(String userId, String userPassword) {
		
		WebElement userIdElement;
		
		userIdElement = driver.findElement(By.name("uid"));
		
		userIdElement.sendKeys(userId);
		
		driver.findElement(By.name("password")).sendKeys(userPassword);
		
		driver.findElement(By.name("btnLogin")).click();
		
	}
    
    public void newCustomer() {
    	
    	driver.findElement(By.linkText("New Customer")).click();
    	
    	driver.findElement(By.name("name")).sendKeys("Akshay");
    	
    	driver.findElement(By.xpath("//input[@value='m']")).click();
    	
    	driver.findElement(By.name("dob")).sendKeys("11/03/1993");
    	
    	driver.findElement(By.name("addr")).sendKeys("Noida 77");
    	
    	driver.findElement(By.name("city")).sendKeys("Noida");
    	
    	driver.findElement(By.name("state")).sendKeys("UP");
    	
    	driver.findElement(By.name("pinno")).sendKeys("201301");
    	
    	driver.findElement(By.name("telephoneno")).sendKeys("899556665");
    	
    	String emailId = "dfsd" + System.currentTimeMillis() +"@gmail.com";
    
    	driver.findElement(By.name("emailid")).sendKeys(emailId);
    	
    	driver.findElement(By.name("password")).sendKeys("akshay");
    	
    	driver.findElement(By.name("sub")).click();
    	
    	
    	
    }
	
        public String customerId() {
    	
    	return driver.findElement(By.xpath("//table[@name=\"customer\"]/tbody/tr[4]/td[2]")).getText();
    	
    }
	
	public void editCustomer() {
		
		driver.findElement(By.linkText("Edit Customer")).click();
		
		driver.findElement(By.name("cusid")).sendKeys("95741");
		
		driver.findElement(By.name("AccSubmit")).click();
		
		driver.findElement(By.name("telephoneno")).sendKeys("64644646");
		
		driver.findElement(By.name("sub")).click();
		
	}
	
	public void deleteCustomer() {
		
		driver.findElement(By.linkText("Delete Customer")).click();
		
		driver.findElement(By.name("cusid")).sendKeys("95741");
		
		driver.findElement(By.name("AccSubmit")).click();
	}

}
