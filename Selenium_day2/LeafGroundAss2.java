package week1day2selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click and Confirm title
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		//Confirm if the button is disabled.
		System.out.println(driver.findElement(By.xpath("//button[contains(@class,'state-disabled')]")).isEnabled());
		//Find the position of the Submit button
		System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation());
		//Find the Save button color
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color"));
		//Find the height and width of this button
		System.out.println("The width and height is "+driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
		//Mouse over and confirm the color changed
		//driver.findElement(By.xpath("(//span[text()='Success'])[1]")).getCssValue("color");
		
		
		
		
		
		//Click Image Button and Click on any hidden button
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		driver.findElement(By.xpath("//span[text()='Secondary']")).click();
		Thread.sleep(2000);
		//How many rounded buttons are there?
		List<WebElement> buttons = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following-sibling::button"));
		int numOfButtons= buttons.size();
		System.out.println(numOfButtons);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
