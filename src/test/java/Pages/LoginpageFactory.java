package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginpageFactory {

	
	WebDriver driver;
	public LoginpageFactory(WebDriver driver) {
		this.driver=driver;


	}
	@FindBy(how=How.XPATH , using ="//input[@name='username']" ) WebElement username;
	@FindBy(how=How.NAME ,using ="password" )WebElement password;
 @FindBy(how=How.XPATH ,using ="//button[@type='submit']" ) WebElement loginButtton;
 

public void settextusername(String uservalue)
{
	username.sendKeys(uservalue);
}
public void settextpassword(String pass)
{
	password.sendKeys(pass);
	
}
public void clickLogin()
{
	loginButtton.click();
}

}
