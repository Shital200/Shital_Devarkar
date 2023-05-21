package DeselectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/multiDropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("cars"));
		Select sel = new Select(dropdown);
		
		for(int i=0;i<8;i++)
		{
			if(i%2==0)
			{
				Thread.sleep(2000);
				sel.selectByIndex(i);
			}
			else
			{
				System.out.println("It is odd place by selecting.........");
			}
		}
		Thread.sleep(2000);
		for(int i=0;i<8;i++)
		{
			if(i%2==0)
			{
				Thread.sleep(2000);
				sel.deselectByIndex(i);
			}
			else
			{
				System.out.println("It is odd place by Deselecting.........");
			}
		}

	}

}
