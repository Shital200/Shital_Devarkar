package keywordDriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		FileLib flib = new FileLib();
		int rc=flib.rowcount(EXCEL_PATH,"InvalidSheet");
		
		for(int i=1;i<rc;i++)
		{
		String invalidusername=flib.readExcelData(EXCEL_PATH,"InvalidSheet",i,0);
		String invalidpassword=flib.readExcelData(EXCEL_PATH,"InvalidSheet",i,1);
		
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		 driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
	}

}
