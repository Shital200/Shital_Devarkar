package Assignment2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		
		//how to close only child window...
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
		Point pt = link.getLocation();
		int xaxis = pt.getX();
		int yaxis = pt.getY();
		
		//Scrolling operation
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(2000);
		
		//handle or address of parent window...
		String pHandle = driver.getWindowHandle();
		
		//click on link & get child window....
		link.click();
		Thread.sleep(2000);
		
		//handle of all the window...
		Set<String> allHandle = driver.getWindowHandles();
		
		//close only child window
		for(String wh:allHandle)
		{
			if(!pHandle.equals(wh))
			{
				Thread.sleep(2000);
				driver.switchTo().window(wh).close();
			}
		}
	}

}
