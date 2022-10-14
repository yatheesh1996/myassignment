package week1day2selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Yatheesh");
		driver.findElement(By.name("lastname")).sendKeys("sekar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8667723389");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456789012");
		Select date=new Select(driver.findElement(By.id("day")));
		date.selectByIndex(2);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(2);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1996");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//driver.findElement(By.name("websubmit")).click();
		driver.close();
		
	}

}
