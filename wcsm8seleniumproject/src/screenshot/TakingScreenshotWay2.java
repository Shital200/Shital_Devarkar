package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakingScreenshotWay2 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Way2:Downcast into Remote Web Driver class
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ss3.png");
		
		Files.copy(src, dest);
		
	}

}
