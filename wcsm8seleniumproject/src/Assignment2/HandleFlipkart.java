package Assignment2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//to handle parent window
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
		
		//to handle child & parent window....
		Set<String> allHandle = driver.getWindowHandles();
		for(String wh:allHandle)
		{
			if(parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			else
			{
				
			}
		}
		String title = driver.getTitle();
		if(title.equals("SAMSUNG Galaxy S23 Ultra 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com"))
		{
			System.out.println("It is child window"); 
		}
		else
		{
			System.out.println("window is not handle"); 
		}

			driver.findElement(By.xpath("//img[@class='_30PAEw']")).click();
	}

}
