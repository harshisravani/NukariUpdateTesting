package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harshi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/nlogin/login");

	Nukari nukari=new Nukari(driver);
	nukari.EmailId().sendKeys("vemulasravani702@gmail.com");
	nukari.PasswordId().sendKeys("6301392938");
	nukari.Login().click();
	//nukari.profile().click();
	

	}

	
	
	
	

}
