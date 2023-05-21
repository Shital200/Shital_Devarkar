package AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotstarLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	     ChromeDriver driver = new ChromeDriver(co);
	     driver.manage().window().maximize();
	     		
	     Thread.sleep(3000);
	     driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='phoneNo']")).sendKeys("8600105829");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		

	}

}
