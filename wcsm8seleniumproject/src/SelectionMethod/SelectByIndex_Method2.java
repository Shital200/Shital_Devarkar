package SelectionMethod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//By using multiple dropdown
public class SelectByIndex_Method2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/multiDropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("cars"));
		Select sel = new Select(dropdown);
		
		Thread.sleep(2000);
		sel.selectByIndex(4);
		
		for(int i=0;i<=6;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}

	}

}
