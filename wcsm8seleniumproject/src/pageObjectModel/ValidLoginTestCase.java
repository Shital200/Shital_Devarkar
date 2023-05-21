package pageObjectModel;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseTest bt = new BaseTest();
		bt.setup();
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		FileLib flib = new FileLib();
		
		lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"pwd"));
		Thread.sleep(2000);
		hp.logoutMethod();
		Thread.sleep(2000);
		bt.tearDown();
	}

}
