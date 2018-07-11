package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailBox;
	
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement passwrdBox;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	public WebElement signinButton;

	public void login(String user, String pass) {
		
		emailBox.sendKeys(user);
		passwrdBox.sendKeys(pass);
		signinButton.click();
		
		
	}
	
	
}
