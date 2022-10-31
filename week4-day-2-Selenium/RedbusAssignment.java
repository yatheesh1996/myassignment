package week4day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedbusAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//a[@class='selectedBus site-links']")).click();
		driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("madiwala");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("Koyambedu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		driver.findElement(By.xpath("(//li[@class='weekend']/span)[2]")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		

	}

}
