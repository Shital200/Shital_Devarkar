package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRightLeftOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		//to perform scrolling right and left operation
				JavascriptExecutor js=(JavascriptExecutor)driver;
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(15000,0)");
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(-15000,0)");


	}

}
