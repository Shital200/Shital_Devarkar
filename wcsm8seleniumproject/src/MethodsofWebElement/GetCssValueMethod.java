package MethodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCssValueMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		 ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
			
		 WebDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		  WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
		  String value = button.getCssValue("color");
		  System.out.println(value);
		 

	}

}
