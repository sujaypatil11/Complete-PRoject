package Basepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.ActiLoginpage;
import POM.ActiLogoutpage;

public class Base1 {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demo.actitime.com/login.do");
	
	ActiLoginpage ac=new ActiLoginpage(d) ;
	//PageFactory.initElements(d, ac);
//	ac.getUsernametf().sendKeys("admin");
//	ac.getPasswordtf().sendKeys("manager");
//	ac.getCheckbox().click();
//	ac.getLoginbtn().click();
	
	ac.Login("admin", "manager");
	
	
	
	ActiLogoutpage lc=new ActiLogoutpage(d);
	lc.Logout();
}
}
