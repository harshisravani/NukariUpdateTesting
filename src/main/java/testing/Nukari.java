package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Page object module. 
 * 
 * 1. only for login page.
 * 
 */
public class Nukari {
	public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,30);
	
	public Nukari(WebDriver driver) {
		this.driver=driver;
	}
	
		By username=By.id("usernameField");
		By password=By.id("passwordField");
		By clicklogin=By.xpath("//button[text()='Login']");
		By clickprofile=By.cssSelector(".icon.userdp");
	
	public WebElement EmailId() {
		//add wait here. always better to add 10 seconds explicit wait. 
		 return driver.findElement(username);
	}
	
	public WebElement PasswordId() {
		return driver.findElement(password);
	}
	public WebElement Login() {
		 return driver.findElement(clicklogin);
	}
	public WebElement profile() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated
				(clickprofile));
		//return driver.findElement(clickprofile);
	}

	}

