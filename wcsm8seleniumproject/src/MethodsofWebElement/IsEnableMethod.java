package MethodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.instagram.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	   
		boolean verifyButton = loginButton.isEnabled();
	    System.out.println(verifyButton);
	    
	    driver.findElement(By.name("username")).sendKeys("Shital Rajigare");
	    driver.findElement(By.name("password")).sendKeys("Shital@123");
	    
	    boolean verify = loginButton.isEnabled();
	    System.out.println(verify);
	    	
	}

}
