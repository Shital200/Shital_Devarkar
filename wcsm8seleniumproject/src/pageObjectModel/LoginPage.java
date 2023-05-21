package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//record all the webElement of LoginPage by using @findBy annotation
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton") private WebElement loginbutton;
	@FindBy(xpath="//input[@name='remember']") private WebElement checbox;
	@FindBy(linkText="Actimind Inc.") private WebElement actiMindLink;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getChecbox() {
		return checbox;
	}
	public WebElement getActiMindLink()
	{
		return actiMindLink;
	}
	
	//Operational method
	public void validLogin(String validUsername,String validPassword) throws InterruptedException
	{
		usernameTB.sendKeys(validUsername);
		Thread.sleep(2000);
		passwordTB.sendKeys(validPassword);
		loginbutton.click();
	}
	public void inValidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		loginbutton.click();
		Thread.sleep(2000);
		usernameTB.clear();
	}
	
	
}
