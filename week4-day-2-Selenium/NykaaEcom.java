package week4day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaEcom {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nykaa.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).perform();
		act.click(driver.findElement(By.id("brandSearchBox"))).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']/span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//span[text()='192.5ml']/parent::button")).click();
		WebElement mrp = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e']/span)[2]"));
		System.out.println("The MRP of the product is Rs."+mrp.getText());
		driver.findElement(By.xpath("(//span[text()='Add to Bag']/parent::button)[1]")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		Thread.sleep(3000);
		WebElement price1 = driver.findElement(By.xpath("//div[contains(@class,'css-15py5ir')]/span[1]"));
		String totalPrice = price1.getText();
		System.out.println(totalPrice);
		driver.findElement(By.xpath("//span[text()='Proceed']/ancestor::button")).click();
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		
	    WebElement price2 = driver.findElement(By.xpath("//div[contains(@class,'grand-total-cell')]//span"));
		String totalPrice2 = price1.getText();
		System.out.println(totalPrice2);
		if(price1==price2) {
			System.out.println("The Total price of the product is same after proceed to pay");
		}else {
			System.out.println("The price are different");
		}
		driver.quit();
		
		
	}

}
