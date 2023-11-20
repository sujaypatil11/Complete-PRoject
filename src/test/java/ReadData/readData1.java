package ReadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readData1 {
public static void main(String[] args) throws IOException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//to read the data from external resources
	FileInputStream fis=new FileInputStream("src\\test\\resources\\selenium.properties");
	
	//to read the data from property file
	Properties p=new Properties();
	
	//to read the location of property file
	p.load(fis);
	
	//to read key from property file
	String url = p.getProperty("URL");
	String USERNAME = p.getProperty("UserName");
	String PASSWORD = p.getProperty("Password");
	
	d.get(url);
	d.findElement(By.id("username")).sendKeys(USERNAME);
	d.findElement(By.name("pwd")).sendKeys(PASSWORD);
}
}
