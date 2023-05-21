package methodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindelementMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
		     WebDriver driver = new ChromeDriver(co);
		     driver.manage().window().maximize();
		     driver.get("http://127.0.0.1/login.do;jsessionid=ajghstbgs32b1");
		     
		     WebElement name = driver.findElement(By.name("username"));
		     Thread.sleep(2000);
		     name.sendKeys("admin");
		     System.out.println(name);

	}

}
