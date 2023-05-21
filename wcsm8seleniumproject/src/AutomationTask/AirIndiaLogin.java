package AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	     ChromeDriver driver = new ChromeDriver(co);
	     driver.manage().window().maximize();
	     		
	     Thread.sleep(2000);
	     driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=Y00yU3Njd1dYcTFifk9uT2ZfaUFPbnZIclBoSE9tNTNkWmZTNjNGMWM2TC0u_en-GB_false_&nonce=Y00yU3Njd1dYcTFifk9uT2ZfaUFPbnZIclBoSE9tNTNkWmZTNjNGMWM2TC0u&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=5B9fw3YdYVzGLL9XfirAGDpi5NuXkmOcEyGJzk-njpQ&ui_locales=en-GB");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("Virat ");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
