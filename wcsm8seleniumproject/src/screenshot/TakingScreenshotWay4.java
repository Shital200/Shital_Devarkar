package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakingScreenshotWay4 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.nykaa.com/");
		 EventFiringWebDriver efd = new EventFiringWebDriver(driver);
		
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
         File src = efd.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./ScreenShots/ss5.png");
			
		 Files.copy(src, dest);
			
	}

}
