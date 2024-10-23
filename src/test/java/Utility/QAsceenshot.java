package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class QAsceenshot {
		public static WebDriver driver;
		public QAsceenshot(WebDriver driver) {
			this.driver=driver;
			
	}
	 public void takescreenshot() {
	 	TakesScreenshot ts= (TakesScreenshot)driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File destinationalertfile=new File( "C:/Users/DELL/Projects/Utilities/qa/src/test/resources/CoveredScreenshot/screensshot.png");
	 try {
	 	FileUtils.copyFile(src, destinationalertfile);
	 } catch (IOException e) {
	 	// TODO Auto-generated catch block
	 	e.printStackTrace();
	 }
	 }
}
