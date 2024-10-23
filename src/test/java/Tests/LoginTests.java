package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomepageFactory;
import Pages.LoginpageFactory;

public class LoginTests extends BaseTest {
@Test
public void execute()
{
LoginpageFactory lpfact= PageFactory.initElements(driver,LoginpageFactory.class);
lpfact.settextusername("Admin");
lpfact.settextpassword("admin123");
lpfact.clickLogin();

	}
}
