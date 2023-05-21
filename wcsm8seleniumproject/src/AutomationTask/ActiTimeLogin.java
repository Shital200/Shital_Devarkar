package AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	     ChromeDriver driver = new ChromeDriver(co);
	     driver.manage().window().maximize();
	     		
	     Thread.sleep(2000);
	     driver.get("http://127.0.0.1/login.do");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.name("username")).sendKeys("admin");
	     Thread.sleep(2000);
	     driver.findElement(By.name("pwd")).sendKeys("manager");
	     Thread.sleep(2000);
	     driver.findElement(By.id("loginButton")).click();

	}

}
