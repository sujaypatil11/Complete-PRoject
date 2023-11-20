package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://www.google.com/");
	d.findElement(By.id("APjFqb")).sendKeys("Pune");
	List<WebElement> allelements = d.findElements(By.xpath("//li[@role='presentation' and not(@id='YMXe')and not(@id='mitGyb')]"));
    
	
	for (WebElement all : allelements) {
		
		System.out.println(all.getText());
	}
}
}
