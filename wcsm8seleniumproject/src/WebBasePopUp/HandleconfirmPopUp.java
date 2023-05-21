package WebBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleconfirmPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/confirmPopup.html");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//to handle confirmation pop-up
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		//String text = alt.getText();
	}

}
