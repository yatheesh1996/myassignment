package week1day2selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Basic Checkbox
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheck')])[1]")).click();
		//Notification
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheck')])[2]")).click();
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Java']//ancestor::td")).click();
		//Tri State Checkbox
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]")).click();
		//Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//Verify if check box is disabled
		System.out.println(driver.findElement(By.xpath("//div[contains(@id,'j_idt102')]")).isEnabled());
		//Select Multiple
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-item-value='London']/div")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Paris']/div")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-selectcheckboxmenu-close')]/span")).click();
		
		
		
		
	}

}
