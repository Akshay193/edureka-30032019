package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	
	public void invokeBrowsers() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay/eclipse-workspace/libs/chromedriver_07042019/chromedriver.exe");
		
		driver = new ChromeDriver();
		
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
