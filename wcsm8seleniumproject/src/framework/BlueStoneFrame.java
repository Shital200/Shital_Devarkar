package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("fc_widget");
		WebElement chatbox = driver.findElement(By.id("chat-icon"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatbox)).click();
		
		driver.switchTo().defaultContent();
		
		//insert the input for chat-box....
		driver.findElement(By.id("chat-fc-name")).sendKeys("Shital");
		driver.findElement(By.id("chat-fc-email")).sendKeys("shitalrajigare@gamil.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("897456123");
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		
	}

}
