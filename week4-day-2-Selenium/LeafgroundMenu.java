package week4day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/menu.xhtml");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Shipments']"))).click().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Tracker']"))).click().perform();
		act.moveToElement(driver.findElement(By.xpath("(//span[text()='Orders'])[2]"))).click().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Back']"))).click().perform();

	}

}
