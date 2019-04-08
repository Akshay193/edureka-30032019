package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithEdge {
	
	EdgeDriver driver;
	
	public void invokeBrowsers() {
		
		System.setProperty("webdriver.edge.driver", "C:/Users/Akshay/eclipse-workspace/libs/MicrosoftWebDriver.exe");
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
		
	}
	
	public void titleOfPage() {
		
		String titleofPage = driver.getTitle();
		
		System.out.println("Title of the Page :"+ titleofPage);
	}
	
	public void navigateCommand() {
		
		driver.navigate().to("https://www.gmail.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	

}
