package OperationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/multiDropdown.html");

		WebElement dropdown = driver.findElement(By.name("cars"));
		
		Select sel = new Select(dropdown);
		List<WebElement> alloptions = sel.getOptions();
		
		//to read all the options from list using looping statement
		for(int i=0;i<alloptions.size();i++)
		{
			String verify = alloptions.get(i).getText();
			System.out.println(verify);
		}

	}

}
