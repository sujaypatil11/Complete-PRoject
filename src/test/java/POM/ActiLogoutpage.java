package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLogoutpage {
       public WebDriver d;
	
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logoutbtn;

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public ActiLogoutpage(WebDriver d) {
    PageFactory.initElements(d, this);
	}
        public ActiLoginpage Logout() {
        	logoutbtn.click();
        	return new ActiLoginpage(d);
	}
	
}
