package WindowBasePopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=8dgsphv8e0w8");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//Home Page..........
		//click on setting
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		
		//click on logo & color scheme
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		Thread.sleep(2000);
		//click on radio button......
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		
		//click on choose button.....
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		// create obj of Actions Class
		Actions act = new Actions(driver);
	//  Use this method for DoubleClick....
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		
		//To handle file upload pop-up
		File file = new File("./AutoIt/FileUploadPopup.exe");
		String absolutePath = file.getAbsolutePath();	
		Thread.sleep(2000);
		Runtime.getRuntime().exec(absolutePath);

	}

}
