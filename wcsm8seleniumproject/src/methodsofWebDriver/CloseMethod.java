package methodsofWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//is used to close the browser
public class CloseMethod {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(co);
		driver.close();
		
		Thread.sleep(2000);
		
		

	}

}
