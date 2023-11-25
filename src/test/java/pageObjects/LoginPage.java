package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id = "Email")
	WebElement txtEmail;
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);

	}

	@FindBy(id = "Password")
	WebElement txtPassword;
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}


	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement btnLogin;
	public void clickLogin() {
		btnLogin.click();
	}

	@FindBy(linkText = "Logout")
	WebElement lnkLogout;
	public void clickLogout() {
		lnkLogout.click();
	}
	
}
