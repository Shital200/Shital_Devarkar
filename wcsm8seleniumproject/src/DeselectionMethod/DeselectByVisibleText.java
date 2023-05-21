package DeselectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/multiDropdown.html");
		
		WebElement dropdown = driver.findElement(By.name("cars"));
		Select sel = new Select(dropdown);
		
		//First select the options from dropdown
		sel.selectByVisibleText("Hyundai");
		Thread.sleep(2000);
		sel.selectByVisibleText("Tata");
		Thread.sleep(2000);
		
		//Deselect the option
		sel.deselectByVisibleText("Tata");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Hyundai");
	}

}
