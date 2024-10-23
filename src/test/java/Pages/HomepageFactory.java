package Pages;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HomepageFactory {
	WebDriver driver;
	
	public HomepageFactory(WebDriver driver) {
		this.driver=driver;
		
}
@Test
public void getpageTitle()
	{
		String Title=driver.getTitle();
System.out.println("The page Title is "+Title);		
	}

@Test
public void clickLinks()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("abcd");
		WebElement inputboxddown=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")); 
Select ddowntext=new Select (inputboxddown);
ddowntext.selectByValue("2");
		
		Wait<WebDriver>wait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
.pollingEvery(Duration.ofMillis(4)).ignoring(TimeoutException.class);
WebElement element = wait.until(
        ExpectedConditions.
        
        elementToBeClickable(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")));
WebElement ele1=driver.findElement(By.xpath("//div[contains (text(),'-- Select --')]"));
Select ddrop1=new Select(ele1);
WebElement ele2=driver.findElement(By.xpath("//div/div[contains (text(),'CAN - Matternity')]"));
ddrop1.selectByVisibleText("CAN - Matternity");


}
}
