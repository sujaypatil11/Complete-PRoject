package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Findelements1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://www.meesho.com/");
	//identify all the elements
	List<WebElement> allelements = d.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
	
	
	//mouse overing actions on all elements
	
	Actions a= new Actions(d);
	for (WebElement all : allelements) {
		Thread.sleep(2000);
		a.moveToElement(all);
		a.perform();
	}
	
}
}
