package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElementscollage1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://collegedunia.com/college/2868-mallamma-marimallappa-womens-arts-and-commerce-college-mysore");
    List<WebElement> allelements = d.findElements(By.xpath("//li[@class='jsx-1508944481 position-relative list-item-text nav-item']"));
    Actions a=new Actions(d);
    
    //Press control btn
    
    a.keyDown(Keys.CONTROL);
    
    for (WebElement all : allelements) {
    	//Thread.sleep(2000);optional
    	
	    //click on all the elements 
    	a.click(all);	
	}
    //release control button
    a.keyUp(Keys.CONTROL);
    a.perform();
}
}
