package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		
		//to perform RightClick on getting started.....
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		
		//click on inspect by using for loop
		Robot rob = new Robot();
		for(int i=0;i<10;i++)
		{
			rob.keyPress(KeyEvent.VK_CONTROL);
			
		}
		
	}

}
