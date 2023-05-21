package dataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestData extends FileLib{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=7dgpnsf55tlus");
		
		// to read the data from external files create the obj of flib 
		
		FileLib flib = new FileLib();
		int rc = flib.rowCount("./data/ActiTimeTestData.xlsx","InvalidSheet");
		for(int i=1;i<=rc;i++)
		{
		String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","InvalidSheet",i,0);
	    String invalidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx","InvalidSheet",i, 1);
	
	    driver.findElement(By.name("username")).sendKeys(invalidUsername);
	    driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.name("username")).clear();
		}
	}

}
