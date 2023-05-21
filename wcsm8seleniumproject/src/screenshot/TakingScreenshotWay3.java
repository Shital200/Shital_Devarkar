package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakingScreenshotWay3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://images.search.yahoo.com/search/images;_ylt=Awr90Mve71FknHkHfERXNyoA;_ylu=Y29sbwNncTEEcG9zAzEEdnRpZAMEc2VjA3BpdnM-?p=beach&fr2=piv-web&type=E210NZ714G0&fr=mcafee");
		Thread.sleep(5000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ss4.png");
		
		//to store a screenshot
		Files.copy(src, dest);
		
	}

}
