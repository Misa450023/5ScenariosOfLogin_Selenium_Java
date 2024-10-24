package tests;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataProviders.DataProviders;
import pages.LoginPage;
import utility.MyUtil;

public class TestClass extends BaseTest {

	LoginPage loginPage;

	@Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
	public void test00(String uname, String pwd, String xpath, String expectedNote) {

		loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login(uname, pwd);
		String verifyText = loginPage.loginVerification(xpath);

		Assert.assertEquals(verifyText, expectedNote);

	}

}
