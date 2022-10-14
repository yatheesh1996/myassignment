package week1day2selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Which is your favorite UI Automation tool?
		WebElement ToolSelect = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select option1=new Select(ToolSelect);
		option1.selectByIndex(1);
		//Choose your preferred country.
		driver.findElement(By.xpath("//label[contains(@id,'country_label')]")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(3000);
		//Confirm Cities belongs to Country is loaded
		driver.findElement(By.xpath("//label[contains(text(),'Select City')]")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//Choose the Course
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		//Choose language randomly
		driver.findElement(By.xpath("//label[contains(text(),'Select Language')]")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		Thread.sleep(3000);
		//Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("//label[contains(text(),'Select Values')]")).click();
		driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
		
		
		
		
		
	}

}
