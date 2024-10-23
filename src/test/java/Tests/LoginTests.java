package Tests;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomepageFactory;
import Pages.LoginpageFactory;
import Utility.QAsceenshot;

public class LoginTests extends BaseTest {
@Test
public void execute()
{
LoginpageFactory lpfact= PageFactory.initElements(driver,LoginpageFactory.class);
lpfact.settextusername("Admin");
lpfact.settextpassword("admin123");
lpfact.clickLogin();

	}
@Test
public void  runshot() {
	
	
	QAsceenshot QAscr=PageFactory.initElements(driver,QAsceenshot.class);
	QAscr.takescreenshot();
	System.out.println("The Screenshot has been taken ");		

}

}
