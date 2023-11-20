package ReadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData2 {
public static void main(String[] args) throws IOException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	FileInputStream fis=new FileInputStream("src\\test\\resources\\selenium.properties");
	Properties p=new Properties();
	p.load(fis);
	
	String url = p.getProperty("site");
	String USERNAME = p.getProperty("un");
	String PASSWORD = p.getProperty("pw");
	
	d.get(url);
	d.findElement(By.xpath("//a[text()='LOGIN']")).click();
	d.findElement(By.name("email")).sendKeys(USERNAME);
	d.findElement(By.name("password")).sendKeys(PASSWORD);

}
}
