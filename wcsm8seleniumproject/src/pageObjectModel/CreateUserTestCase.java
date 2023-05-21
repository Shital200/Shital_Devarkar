package pageObjectModel;

public class CreateUserTestCase extends BaseTest{

	BaseTest bt=new BaseTest();
	bt.setUp();
	
	FileLib flib=new FileLib();
	
	LoginPage lp=new LoginPage(driver);
	lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"pwd"));
	Thread.sleep(2000);
	HomePage hp=new HomePage(driver);
	hp.userModuleMethod();
	Thread.sleep(2000);
	userListPage ulp=new userListPage(driver);
	
	
	
}
