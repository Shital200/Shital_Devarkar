package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/linktext.html");
		driver.findElement(By.linkText("FlipkartLink")).click();
		Thread.sleep(2000);
		
		

	}

}
