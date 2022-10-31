package week4day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAss {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 9 pro",Keys.ENTER);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The price of the mobile: Rs."+price);
		Thread.sleep(2000);
		String noOfCustomersRatings = driver.findElement(By.xpath("//span[contains(@class,'a-size-base puis-light-weight-text')]")).getText();
		System.out.println("Customer ratings: "+noOfCustomersRatings);
		WebElement ratings = driver.findElement(By.xpath("(//i[contains(@class,'a-icon-star-small')]/ancestor::span[@data-action='a-popover'])[1]"));
		Thread.sleep(2000);
		ratings.click();
		Thread.sleep(2000);
		String RatingsPercentOf5Star = driver.findElement(By.xpath("(//span[@class='a-size-base']/a)[2]")).getText();
		System.out.println("The percent of 5Star ratings: "+RatingsPercentOf5Star);
		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		WebElement productimg = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		File image =productimg. getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/product.jpg");
		FileUtils.copyFile(image, des);
		driver.findElement(By.id("add-to-cart-button")).click();
		String subTotal = driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-price')]/span")).getText();
		System.out.println(subTotal);
		if(subTotal.contains(subTotal)) {
			System.out.println("The price and subtotal are equal");
		}else {
			System.out.println("Not equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
