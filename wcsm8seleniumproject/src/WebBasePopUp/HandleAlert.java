package WebBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/suraj/OneDrive/Desktop/selenium%20html%20program/alertpopup.html");
		
		//generate alert pop-up
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//handle alert pop-up
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		//to print pop-up
		System.out.println(alt.getText());
		alt.dismiss();

	}

}
