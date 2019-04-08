package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacbookProject {
	
ChromeDriver driver;
	
	public void invokeBrowsers() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay/eclipse-workspace/libs/chromedriver_07042019/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
	

}
	
	public void login(String userId, String userPassword) {
		
		WebElement userIdElement;
		
		userIdElement = driver.findElement(By.name("email"));
		
		userIdElement.sendKeys(userId);
		
		driver.findElement(By.name("pass")).sendKeys(userPassword);
		
		driver.findElement(By.id("u_0_2")).click();
		
		
		
		
		
		
	}
}
