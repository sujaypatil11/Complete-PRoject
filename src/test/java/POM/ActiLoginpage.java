package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginpage {
     public WebDriver d;
	
	@FindBy(id="username")
	private WebElement usernametf;
	
	@FindBy(name="pwd")
	private WebElement passwordtf;
	
	@FindBy(id="keepMeLoggedInSection")
	private WebElement checkbox;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;

	public WebElement getUsernametf() {
		return usernametf;
	}

	public WebElement getPasswordtf() {
		return passwordtf;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	//create a constructor
	public ActiLoginpage(WebDriver d) {
      PageFactory.initElements(d,this);
	}
	
	//create a method
	public ActiLogoutpage Login(String usernamedata, String passworddata) {
		usernametf.sendKeys(usernamedata);
		passwordtf.sendKeys(passworddata);
		checkbox.click();
		loginbtn.click();
		
		return new ActiLogoutpage(d);
	}
	
	
}
