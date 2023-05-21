package OperationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/multiDropdown.html");

		WebElement dropdown = driver.findElement(By.name("cars"));
		
		Select sel = new Select(dropdown);
		
		//how to select multiple option
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
		}
		
		List<WebElement> alloptions = sel.getAllSelectedOptions();
		for(WebElement op:alloptions)
		{
			String options = op.getText();
			System.out.println(options);
		}

	}

}
