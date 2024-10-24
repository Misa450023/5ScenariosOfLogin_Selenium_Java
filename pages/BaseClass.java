package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public WebDriver driver;
	public WebDriverWait wait;

	public BaseClass(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	public void waiting(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	IWrite writeText = (WebDriver driver, By element, String text) -> {
		waiting(element);
		driver.findElement(element).sendKeys(text);
	};
	IClick clickOn = (WebDriver driver, By element) -> {
		waiting(element);
		driver.findElement(element).click();
	};
	IGet getUrl = (WebDriver driver, By element) -> {
		return driver.getCurrentUrl();
	};
	IGet getText = (WebDriver driver, By element) -> {
		waiting(element);
		return driver.findElement(element).getText();
	};

}
