package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleSwitchwindow {
 static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:/Users/DELL/Software/Driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");

	}

}
