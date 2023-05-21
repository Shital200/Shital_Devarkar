package methodsofWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindelementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	     WebDriver driver = new ChromeDriver(co);
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com/");
	     
	     driver.switchTo().activeElement().sendKeys("coffee");
	     Thread.sleep(2000);
	     
	     List<WebElement> coffeeOptions =driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	     Thread.sleep(2000);
	     
//	     for(int i=1;i<coffeeOptions.size();i++)
//	     {
//	    	 String coffee=coffeeOptions.get(i).getText();
//	    	 System.out.println(coffee);
//	    	 Thread.sleep(2000);
//	     }
	     
	     for(WebElement coffee:coffeeOptions)
			{
				System.out.println(coffee.getText());
				Thread.sleep(2000);
			}

	}

}
