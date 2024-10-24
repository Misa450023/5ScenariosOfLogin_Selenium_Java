package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void openPage() {

		driver.get("https://www.saucedemo.com/");
	}

	public void login(String uname, String password) {

		writeText.interact(driver, By.xpath("//input[@id='user-name']"), uname);
		writeText.interact(driver, By.xpath("//input[@id='password']"), password);
		clickOn.interact(driver, By.xpath("//input[@id='login-button']"));
	}

	public String loginVerification(String elxpath) {

		return getText.pickUp(driver, By.xpath(elxpath));
	}

}
