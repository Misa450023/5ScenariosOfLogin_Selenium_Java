package dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
@DataProvider (name = "loginData")
public String[][] loginData(){
	
String[][]data={

{"standard_user","secret_sauce","//span[@class='title']","Products"},           
{"false","false","//div[@class='error-message-container error']/h3","Epic sadface: Username and password do not match any user in this service"},
{"locked_out_user", "secret_sauce","//div[@class='error-message-container error']/h3","Epic sadface: Sorry, this user has been locked out."},
{"", "secret_sauce","//div[@class='error-message-container error']/h3","Epic sadface: Username is required"},
{"standard_user", "","//div[@class='error-message-container error']/h3","Epic sadface: Password is required"}
};

return data;
}



}
