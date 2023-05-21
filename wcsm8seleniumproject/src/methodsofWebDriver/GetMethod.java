package methodsofWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//is used to launch web application
public class GetMethod {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	     ChromeDriver driver = new ChromeDriver(co);
	     driver.manage().window().maximize();
	     		
	     Thread.sleep(2000);
	     driver.get("https://www.selenium.dev/");
	    // driver.close();
	    


	}

}
