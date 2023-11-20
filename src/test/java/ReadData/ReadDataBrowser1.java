package ReadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataBrowser1 {
public static void main(String[] args) throws IOException {
	
	final WebDriver d;
	
	FileInputStream fis=new FileInputStream("src\\test\\resources\\selenium.properties");
	Properties p=new Properties();
	p.load(fis);

     String BROWSER = p.getProperty("browser");
    
     
	if (BROWSER.equals("Chrome")) {
		 d=new ChromeDriver();
	}
	else if (BROWSER.equals("Edge")) {
		 d=new EdgeDriver();
	}
	else {
		 d=new FirefoxDriver();
	}
	
	
	String url = p.getProperty("site");
	String USERNAME = p.getProperty("un");
	String PASSWORD = p.getProperty("pw");
	
	d.get(url);
	d.findElement(By.xpath("//a[text()='LOGIN']")).click();
	d.findElement(By.name("email")).sendKeys(USERNAME);
	d.findElement(By.name("password")).sendKeys(PASSWORD);
    
}
}
