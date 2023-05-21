package AutomationTask;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/dropdown.html");
		WebElement dropdown = driver.findElement(By.name("MENU"));
		
		//to handle dropdown create obj of select class
		Select sel = new Select(dropdown);
		
		//to get all options from dropdown
		List<WebElement> alloptions = sel.getOptions();
		
		//to remove duplicates & maintain insertion order
		TreeSet<String> ts = new TreeSet<String>();
		
		//to read list by removing duplicates
		for(int i=0;i<alloptions.size();i++)
		{
			Thread.sleep(2000);
			String op = alloptions.get(i).getText();
			ts.add(op);
		}
		
		//to read option from set
		for(String options:ts)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}
		

	}

}
