package pagefile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pageClass {

	public static WebDriver driver;

	public static By usrname = By.cssSelector("input#user-name");
	public static By psswrd = By.cssSelector("input#password");
	public static By login = By.cssSelector("input#login-button");
	public static By applogo = By.cssSelector("div.app_logo");
	public void user_launch_a_site_url() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	public void user_enter_username() {
		WebElement URSname = driver.findElement(usrname);
		URSname.sendKeys("standard_user");
	}

	public void user_enter_password() {
		WebElement psswRD = driver.findElement(psswrd);
		psswRD.sendKeys("secret_sauce");
	}

	public void user_clicked_on_login_button() {
		WebElement loginbtn = driver.findElement(login);
		loginbtn.click();
		
		/////jjjjjj
	}

	public void user_verify_sucessful_login() {
		
		WebElement logo = driver.findElement(applogo);
		Assert.assertTrue(logo.isDisplayed());

	}

}
