package AutomationTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAndRobotTask {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		WebElement wj = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(wj).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		WebElement filterby = driver.findElement(By.xpath("//div[text()='Filter by']"));
		Thread.sleep(2000);
		
		for(int i=0;i<=2;i++)
		{
			act.clickAndHold(filterby).perform();
		}
		
		//to copy the Filter By using Robot Class
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		
		rob.keyRelease(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.findElement(By.name("search_query")).click();
		
		//Paste the filter by....
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		WebElement searchButton = driver.findElement(By.name("submit_search"));
		searchButton.submit();
		 
		

	}

}
