package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage {

	@FindBy(xpath="//input[2value='Create New User']") private WebElement CreateNewUserButton;
	@FindBy(xpath="//input[@name='username']") private WebElement userNameTB;
	@FindBy(xpath="//input[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath="//input[@name='passwordTextRetype']") private WebElement passwordTextRetypeTB;
	@FindBy(xpath="//input[@name='firstName']") private WebElement firstnameTB;
	@FindBy(xpath="//input[@name='lastName']") private WebElement lastnameTB;
	@FindBy(xpath="//input[@type='submit']") private WebElement CreateUserButton;
	@FindBy(xpath="//input[@value='Delete This User']") private WebElement deleteUser;
	
	
	
	//Operational Method
	public void createUserButton()
	{
		CreateNewUserButton.click();
		Thread.sleep(2000);
		userNameTB.sendKeys(usn);
		Thread.sleep(2000);
		passwordTB.sendKeys(pass);
		Thread.sleep(2000);
		passwordTextRetypeTB.sendKeys(pass);
		Thread.sleep(2000);
		firstnameTB.sendKeys(fn);
		Thread.sleep(2000);
		lastnameTB.sendKeys(ln);
		Thread.sleep(2000);
		CreateUserButton.click();
		
	}
	public void deleteUserMethod()
	{
		userCreatedLink.click();
		Thread.sleep(2000);
		DeleteUserButton.click();
		WorkLib wl = new WorkLib();
		wl.handleConfirmPopup();
	}
}
