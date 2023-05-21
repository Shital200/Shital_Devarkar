package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLogintestCase extends BaseTest{

	private static final String EXCEL_PATH = null;

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		FileLib flib = new FileLib();
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		
		int rc=flib.rowCount(EXCEL_PATH, "InvalidSheet");
		for(int i=0;i<=rc;i++)
		{
		
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "InvalidSheet", i, 0);
			String invalidPassword=flib.readExcelData(EXCEL_PATH, "InvalidSheet", i, 1);
		
			lp.inValidLogin(invalidUsername,invalidPassword);
		}
		bt.tearDown();
		

	}

}
