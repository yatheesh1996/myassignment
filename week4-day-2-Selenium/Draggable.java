package week4day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/draggable");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content ui-draggable')]"));
		System.out.println(source.getLocation());
		Actions act = new Actions(driver);
		act.dragAndDropBy(source, 230, 260).perform();
		System.out.println(source.getLocation());
		
	}

}
