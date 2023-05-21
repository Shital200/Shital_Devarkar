package MethodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.netflix.com/in/login");

		WebElement unameTB = driver.findElement(By.name("userLoginId"));
		WebElement passTB = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		if(unameTB.isDisplayed())
		{
			unameTB.sendKeys("Tanmay@123");
		}
		else
		{
			System.out.println("We will get Exception.........");
		}
		
		if(passTB.isDisplayed())
		{
			passTB.sendKeys("qwert123");
		}
		else
		{
			System.out.println("We will get Exception.........");
		}
		
		if(button.isDisplayed())
		{
			button.click();
		}
		else
		{
			System.out.println("We will get Exception.........");
		}
	}

}
